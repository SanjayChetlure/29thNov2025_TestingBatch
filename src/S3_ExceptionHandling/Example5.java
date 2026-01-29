package S3_ExceptionHandling;
public class Example5
{
    //example of multiple catch block for 1 try block

    public static void main(String[] args)
    {
        int [] ar={10,40,30,10};

        try
        {
            System.out.println(ar[8]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException handled");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndex Out OfBoundsException handled");
        }
        System.out.println("hi");
    }
}
