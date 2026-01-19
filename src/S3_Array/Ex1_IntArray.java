package S3_Array;
public class Ex1_IntArray
{
    public static void main(String[] args)
    {
        int [] ar=new int[4];    //index : 0-3

        ar[0]=103;
        ar[1]=104;
        ar[2]=101;
        ar[3]=102;

//        int temp=ar[0];
//        ar[0]=ar[2];
//        ar[2]=temp;

        System.out.println(ar[3]);    //102
        System.out.println(ar.length);

        System.out.println("----Print all data----");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
