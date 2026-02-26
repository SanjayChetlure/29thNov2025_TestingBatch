package S3_Collection;
import java.util.*;

public class Ex2_Vector
{
    public static void main(String[] args)
    {
        Vector al=new Vector();                    //default/initial capacity=10
        al.add("Ganesh");
        al.add(101);
        al.add(71.5f);
        al.add('A');
        al.add(101);
        al.add(null);
        al.add(null);

        System.out.println(al.capacity());
        System.out.println(al);
        System.out.println(al.size());       //7
        System.out.println(al.isEmpty());    //false
        System.out.println(al.get(2));

        //update info
        al.set(5,"Amit");
        System.out.println(al);

        //add data in between Vector -> right shift operation
        al.add(4,"200");
        System.out.println(al);

        //remove data i between Vector  -> left shift operation
        al.remove(4);
        System.out.println(al);

        System.out.println("print all data using for loop");
        for(int i=0; i<=al.size()-1; i++)
        {
            System.out.println(al.get(i));
        }


        System.out.println("----print all data using Iterator cursor----");
        Iterator itr = al.iterator();         //copy all data from Vector into Iterator object
        while(itr.hasNext())       //true/false
        {
            System.out.println(itr.next());
        }


        System.out.println("----print all data using ListIterator cursor----");
        ListIterator litr = al.listIterator();    //copy all data from Vector into ListIterator object
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("----print all data using Enumeration----");
        Enumeration enu=al.elements();             //copy all data from vector object into Enumeration
        while(enu.hasMoreElements())
        {
            System.out.println(enu.nextElement());
        }

        System.out.println("----print all data using for each loop----");
        for(Object s1: al)
        {
            System.out.println(s1);
        }


        al.clear();
        System.out.println(al.size());


    }
}
