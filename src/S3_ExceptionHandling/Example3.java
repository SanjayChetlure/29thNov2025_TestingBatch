package S3_ExceptionHandling;
public class Example3
{
    public static void main(String[] args) {

        int num1=10;
        int num2=0;
        int div=0;

        try
        {
            div=num1/num2;          // risky code     10/0=5
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception handled");
            div=num1/1;      //Alternate code   10/1=10
        }

        System.out.println(div);

        System.out.println("hi");
        System.out.println("hello");
    }
}
