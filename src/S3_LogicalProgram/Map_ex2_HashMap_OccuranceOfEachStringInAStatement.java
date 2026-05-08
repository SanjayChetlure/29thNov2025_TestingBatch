package S3_LogicalProgram;
import java.util.HashMap;
import java.util.Set;

public class Map_ex2_HashMap_OccuranceOfEachStringInAStatement
{
    public static void main(String[] args)
    {
        String str="my name is abc is abc is";
        String [] ar=str.split(" ");   //[my(0) name(1) is(2) abc(3) is(4) abc(5) is(6)]

        HashMap<String, Integer> mp=new HashMap();
      //         my       1
     //         name      1
    //           is       1+1=2+1=3
        //      abc       1+1=2


        //           6<=6
        for(int i=0; i<=ar.length-1; i++)
        {  //              6
            String s1 = ar[i];  //is

            if(mp.containsKey(s1))   //is  ->
            {
                mp.put(s1, mp.get(s1)+1);
            }
            else
            {
                mp.put(s1, 1);    //abc , 1
            }
        }


        Set<String> allKeys = mp.keySet();   //
//		for(String key:allKeys)
//		{
//			System.out.println(key+"-"+mp.get(key));
//		}

        //print duplicate words in a statement/para
//        for(String key:allKeys)
//        {
//            if(mp.get(key)>1)
//            {
//                System.out.println(key+"-"+mp.get(key));
//            }
//        }

        //print unique words in a statement/para
        for(String key:allKeys)
        {
            if(mp.get(key)==1)
            {
                System.out.println(key+"-"+mp.get(key));
            }
        }

    }
}