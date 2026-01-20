package S3_Array;
import java.util.Arrays;
public class Ex6_Smallest_HighestNumberInArray {

    public static void main(String[] args)
    {
        int [] ar=new int[4];

        ar[0]=103;       //101
        ar[1]=104;       //102
        ar[2]=101;       //103
        ar[3]=102;       //104

        Arrays.sort(ar);

        System.out.println(ar[0]);
        System.out.println(ar[ar.length-1]);
    }
}
