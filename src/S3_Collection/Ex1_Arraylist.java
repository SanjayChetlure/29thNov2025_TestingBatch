package S3_Collection;
import java.util.ArrayList;

public class Ex1_Arraylist
{
    public static void main(String[] args)
    {
//        ArrayList al=new ArrayList();                    //default/initial capacity=10
        ArrayList al=new ArrayList(50);        //initial capacity=50
        al.add("Ganesh");
        al.add(101);
        al.add(71.5f);
        al.add('A');
        al.add(101);
        al.add(null);
        al.add(null);

        System.out.println(al);
        System.out.println(al.size());       //7
        System.out.println(al.isEmpty());    //false



    }
}
