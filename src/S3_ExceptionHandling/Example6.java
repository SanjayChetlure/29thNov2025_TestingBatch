package S3_ExceptionHandling;
public class Example6
{
    //Example of generic exception

    public static void main(String[] args)
    {
        int [] ar={10,40,30,10};

        try
        {
            System.out.println(ar[7]);
        }
        catch (Exception e)
        {
            System.out.println("Generic exception handled");
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}
