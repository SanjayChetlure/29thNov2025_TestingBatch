package S3_ExceptionHandling;
public class Example1
{
    public static void main(String[] args) {

        int num1=10;
        int num2=0;
        int div=0;

        try
        {
             div=num1/num2;          // risky code     10/2=5
        }
        catch (ArithmeticException e)
        {
            System.out.println("Arithmetic exception handled");    //only msg
        }

        System.out.println(div);

        System.out.println("hi");
        System.out.println("hello");
    }
}
