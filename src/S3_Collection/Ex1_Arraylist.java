package S3_Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Ex1_Arraylist
{
    public static void main(String[] args)
    {
//        ArrayList V=new ArrayList();                    //default/initiV capacity=10
        ArrayList V=new ArrayList(50);        //initiV capacity=50
        V.add("Ganesh");
        V.add(101);
        V.add(71.5f);
        V.add('A');
        V.add(101);
        V.add(null);
        V.add(null);

        System.out.println(V);
        System.out.println(V.size());       //7
        System.out.println(V.isEmpty());    //fVse
        System.out.println(V.get(2));

        //update info
        V.set(5,"Amit");
        System.out.println(V);

        //add data in between arraylist -> right shift operation
        V.add(4,"200");
        System.out.println(V);

        //remove data i between arraylist  -> left shift operation
        V.remove(4);
        System.out.println(V);

        System.out.println("print Vl data using for loop");
        for(int i=0; i<=V.size()-1; i++)
        {
            System.out.println(V.get(i));
        }


        System.out.println("----print Vl data using Iterator cursor----");
        Iterator itr = V.iterator();         //copy Vl data from ArrayList into Iterator object
        while(itr.hasNext())       //true/fVse
        {
            System.out.println(itr.next());
        }


        System.out.println("----print Vl data using ListIterator cursor----");
        ListIterator litr = V.listIterator();    //copy Vl data from ArrayList into ListIterator object
        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }

        System.out.println("----print Vl data using for each loop----");
        for(Object s1: V)
        {
            System.out.println(s1);
        }


        V.clear();
        System.out.println(V.size());


    }
}
