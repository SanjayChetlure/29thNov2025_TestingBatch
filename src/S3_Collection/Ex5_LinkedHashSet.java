package S3_Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ex5_LinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add("Amit");
        lhs.add(101);
        lhs.add('A');
        lhs.add(65.5f);
        lhs.add(null);
        lhs.add(null);
        lhs.add(101);

        System.out.println(lhs);
        System.out.println(lhs.size());
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Amit"));

        //remove/delete data
        lhs.remove(null);
        System.out.println(lhs);

        System.out.println("---print all data using for each loop---");
        for(Object s1:lhs)
        {
            System.out.println(s1);
        }

        System.out.println("---print all data using Iterator cursor---");
        Iterator itr = lhs.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        lhs.clear();
        System.out.println(lhs.size());

    }
}
