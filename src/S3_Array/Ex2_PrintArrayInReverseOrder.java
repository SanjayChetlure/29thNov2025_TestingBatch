package S3_Array;
public class Ex2_PrintArrayInReverseOrder
{
    public static void main(String[] args)
    {
        int [] ar=new int[4];

        ar[0]=103;
        ar[1]=104;
        ar[2]=101;
        ar[3]=102;

        System.out.println("----Print original data----");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        System.out.println("----Print Array in reverse order----");
        //       i=3           -1>=0
        for(int i=ar.length-1; i>=0; i--)
        {
            System.out.println(ar[i]);      //102 101 104 103
        }
    }
}
