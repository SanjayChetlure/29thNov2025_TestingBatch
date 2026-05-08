package S3_LogicalProgram;
import java.util.HashMap;
import java.util.Set;

public class Map_ex1_HashMap_OccuranceOfEachCharInAString
{
    public static void main(String[] args)
    {
        String str="abcaba";

//          k    v
//          a    1+1=2+1=3
//          b    1+1=2
//          c    1

        HashMap<Character, Integer> mp=new HashMap();
        //       a           3
        //       b           2
       //        c           1

        //          	6<=5
        for(int i=0; i<=str.length()-1; i++)
        {          //            5
            char s1 = str.charAt(i);     //a

            if(mp.containsKey(s1))   //a => true
            {
                mp.put(s1, mp.get(s1)+1);   // b, 2+1=3           //update value of existing key
            }
            else
            {
                mp.put(s1, 1);    //c, 1
            }
        }

        Set<Character> allKeys = mp.keySet();    //[a, b, c]        //get all keys

		//1: Occurrence of each character
//		for(Character key:allKeys)
//		{
//			System.out.println(key+"-"+mp.get(key));
//		}


        //print only duplicate chars
//        for(Character key:allKeys)
//        {
//            if(mp.get(key)>1)   //condition for duplicate key
//            {
//                System.out.println(key+"-"+mp.get(key));
//            }
//        }


//        //print only unique chars
        for(Character key:allKeys)
        {
            if(mp.get(key)==1)   //condition for unique key
            {
                System.out.println(key+"-"+mp.get(key));
            }
        }

    }
}