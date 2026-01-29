package S3_ExceptionHandling;
public class Example8
{
    //Example multiple try & catch block in same method

    public static void main(String[] args)
    {
        String s1="abcd";
        try
        {
            System.out.println(s1.charAt(7));          //risky code 1
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBounds Exception handled");
        }

        String [] ar={"amol","ganesh","suresh"};
        try
        {
            System.out.println(ar[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception handled");
        }
    }
}
