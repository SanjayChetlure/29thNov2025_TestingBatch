package S3_Map;
import java.util.HashMap;
import java.util.Set;
public class Map_ex1_HashMap
{
    public static void main(String[] args)
    {
        HashMap<Integer , String> hm=new HashMap<>();
        hm.put(104, "ganesh");       //(key,value)
        hm.put(55, "suresh");
        hm.put(101, "mahesh");
        hm.put(71, "rahul");

        System.out.println(hm);


        //update value of spacefic key
        hm.put(71, "RAHUL");
        System.out.println(hm);

        //check size of map (total no of keys)
        System.out.println(hm.size());

        //check any specific key available or not
        System.out.println(hm.containsKey(102));   //true

        //get value of any key
        System.out.println(hm.get(101));

        System.out.println("-----------");

        //get all keys
        Set<Integer> allKeys = hm.keySet();   //{104, 55, 101, 71}
        for(Integer key:allKeys)
        {
            System.out.println(key);
        }

        System.out.println("-----");

        //get all keys & Values
        for(Integer key:allKeys)
        {
            System.out.println(key+" : "+hm.get(key));
        }
    }
}

