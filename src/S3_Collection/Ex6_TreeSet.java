package S3_Collection;
import java.util.Iterator;
import java.util.TreeSet;
public class Ex6_TreeSet
{
    public static void main(String[] args)
    {
        TreeSet tr=new TreeSet();
        tr.add(104);
        tr.add(101);
        tr.add(102);
        tr.add(107);
        tr.add(106);
        tr.add(103);
        tr.add(105);
        tr.add(105);
//        tr.add(null);
//        tr.add("ganesh");

        System.out.println(tr);
        System.out.println(tr.size());
        System.out.println(tr.isEmpty());
        System.out.println(tr.contains(105));

        //remove specific data
        tr.remove(105);
        System.out.println(tr);

        //remove data from 1st position
        tr.pollFirst();
        System.out.println(tr);

        //remove data from last position
        tr.pollLast();
        System.out.println(tr);

        //get data from 1st position
        System.out.println(tr.first());

        //get data from last position
        System.out.println(tr.last());

        System.out.println("----print all data using Iterator cursor----");
        Iterator itr = tr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("----print all data using DescendingIterator cursor----");
        Iterator itr1 = tr.descendingIterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        System.out.println("---print all data using for each loop----");
        for(Object s1:tr)
        {
            System.out.println(s1);
        }
    }
}
