package S3_Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Ex4_HashSet1
{
    public static void main(String[] args)
    {
        HashSet hs=new HashSet();
        hs.add("Amit");
        hs.add(101);
        hs.add('A');
        hs.add(65.5f);
        hs.add(null);
        hs.add(null);
        hs.add(101);

        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains("Amit"));

        //remove/delete data
        hs.remove(null);
        System.out.println(hs);

        System.out.println("---print all data using for each loop---");
        for(Object s1:hs)
        {
            System.out.println(s1);
        }

        System.out.println("---print all data using Iterator cursor---");
        Iterator itr = hs.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        hs.clear();
        System.out.println(hs.size());

    }
}
