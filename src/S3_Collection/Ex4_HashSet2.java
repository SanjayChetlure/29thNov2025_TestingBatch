package S3_Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class Ex4_HashSet2
{
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();   //[Ganesh, Ganesh, Ganesh, 101, 71.5, A, 101, 101, null, null]
        al.add("Ganesh");
        al.add("Ganesh");
        al.add("Ganesh");
        al.add(101);
        al.add(71.5f);
        al.add('A');
        al.add(101);
        al.add(101);
        al.add(null);
        al.add(null);
        System.out.println(al);

        HashSet hs=new HashSet(al);   //[Ganesh, 101, 71.5, A, 101, null]
        System.out.println(hs);

    }
}
