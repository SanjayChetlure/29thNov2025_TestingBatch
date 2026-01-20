package S3_Array;
import java.util.Arrays;
public class Ex3_StringArraySorting
{
    public static void main(String[] args)
    {
        //Assignment

        String [] ar=new String[5];

        ar[0]="Ramesh";
        ar[1]="Ganesh";
        ar[2]="Mahesh";
        ar[3]="Suresh";
        ar[4]="Rahul";

        System.out.println("----Print original data---");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        Arrays.sort(ar);

        System.out.println("----Print data in alphabetical order---");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }


    }
}
