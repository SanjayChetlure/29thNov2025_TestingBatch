package S3_Array;
public class Ex4_SwapDataInArray
{
    public static void main(String[] args) {

        int [] ar=new int[4];
        ar[0]=103;
        ar[1]=104;
        ar[2]=101;
        ar[3]=102;

        System.out.println("---print original data---");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

        int temp=ar[0];    //103
        ar[0]=ar[1];       //104
        ar[1]=temp;        //103

        System.out.println("---print data after swaping---");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }

    }
}
