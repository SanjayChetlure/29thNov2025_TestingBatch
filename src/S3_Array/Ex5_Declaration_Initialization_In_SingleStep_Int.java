package S3_Array;
public class Ex5_Declaration_Initialization_In_SingleStep_Int
{
    public static void main(String[] args)
    {
        int [] ar={104,102,101,103};

        System.out.println(ar.length);
        System.out.println(ar[1]);

        System.out.println("--print all data--");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
