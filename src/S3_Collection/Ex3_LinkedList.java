package S3_Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex3_LinkedList
{
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        ll.add("mahesh");
        ll.add(101);
        ll.add('A');
        ll.add(65.1f);
        ll.add(101);
        ll.add(null);
        ll.add(null);

        System.out.println(ll);
        System.out.println(ll.size());
        System.out.println(ll.isEmpty());
        System.out.println(ll.get(1));

        //update data
        ll.set(5,"suresh");
        System.out.println(ll);

        //add data in between linkedList
        ll.add(5,"200");
        System.out.println(ll);

        //remove data in between linkedlist
        ll.remove(5);
        System.out.println(ll);

        System.out.println("----print all data using Iterator cursor----");
        Iterator itr = ll.iterator();      //copy all data from linkedList to Iterator
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        System.out.println("----print all data using ListIterator cursor----");
        ListIterator litr = ll.listIterator();
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("----print all data using for loop----");
        for(int i=0; i<=ll.size()-1; i++)
        {
            System.out.println(ll.get(i));
        }

        System.out.println("----print all data using for each loop----");
        for(Object s1:ll)
        {
            System.out.println(s1);
        }

        ll.clear();
        System.out.println(ll.size());



    }
}
