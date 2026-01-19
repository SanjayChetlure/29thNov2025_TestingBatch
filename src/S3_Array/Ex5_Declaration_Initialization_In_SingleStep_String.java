package S3_Array;
public class Ex5_Declaration_Initialization_In_SingleStep_String
{
    public static void main(String[] args)
    {
        String [] ar={"rahul","ganesh","mahesh","Suresh","ramesh"};

        System.out.println(ar.length);   //5
        System.out.println(ar[1]);       //ganesh

        System.out.println("--print all data--");
        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);
        }
    }
}
