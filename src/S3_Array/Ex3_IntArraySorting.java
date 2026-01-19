package S3_Array;
import java.util.Arrays;
public class Ex3_IntArraySorting
{
    public static void main(String[] args)
    {
        int [] ar=new int[4];

        ar[0]=103;       //101
        ar[1]=104;       //102
        ar[2]=101;       //103
        ar[3]=102;       //104

        System.out.println("----Print original data----");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        Arrays.sort(ar);        //diffClassName.methodName(inp)  [101, 102, 103, 104]

        System.out.println("---print array in Ascending order---");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("---print array in Descending order---");
        for(int i=ar.length-1; i>=0; i--)
        {
            System.out.println(ar[i]);
        }
    }
}
