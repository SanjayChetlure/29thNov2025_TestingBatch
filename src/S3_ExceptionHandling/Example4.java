package S3_ExceptionHandling;
public class Example4
{
    public static void main(String[] args)
    {
        int [] ar={10,40,30,10};

        try
        {
            System.out.println(ar[6]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndex Out OfBoundsException handled");
        }

        System.out.println("hi");
    }
}
