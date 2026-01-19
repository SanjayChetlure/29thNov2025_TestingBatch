package S3_Array;
public class Ex1_CharArray
{
    public static void main(String[] args)
    {
        char [] ar=new char[4];

        ar[0]='B';
        ar[1]='C';
        ar[2]='D';
        ar[3]='A';

        System.out.println(ar[3]);

        System.out.println("---Print all data----");

        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
