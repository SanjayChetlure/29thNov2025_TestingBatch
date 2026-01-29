package S3_ExceptionHandling;
public class Example7
{
    //Example of correct way of using generic exception
    public static void main(String[] args)
    {
        int [] ar={10,40,30,10};

        try
        {
            System.out.println(ar[7]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException handled");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception handled");
        }
        catch (Exception e)
        {
            System.out.println("Generic exception handled");
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}
