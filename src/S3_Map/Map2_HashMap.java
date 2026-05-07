package S3_Map;
import java.util.HashMap;
import java.util.Hashtable;
public class Map2_HashMap
{
    public static void main(String[] args) {

        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(5, "ganesh");
        hm.put(11, "mahesh");
        hm.put(2, "suresh");
        hm.put(4, "ramesh");
        hm.put(3, "rahul");
        hm.put(null, null);
        hm.put(6, null);

        System.out.println(hm);
    }
}
