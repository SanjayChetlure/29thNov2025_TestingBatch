package S3_ExceptionHandling;
public class Example9
{
    public static void main(String[] args)
    {
        String s1="abcd";
        String [] ar={"amol","ganesh","suresh"};

        try
        {
            try
            {
                System.out.println(s1.charAt(7));          //risky code 1
            }
            catch (StringIndexOutOfBoundsException e)
            {
                System.out.println("StringIndexOutOfBounds Exception handled");
            }
            System.out.println(ar[5]);          //risky code2
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception handled");
        }

        System.out.println("hi");


//        try           //outer try block
//        {
//            try         //inner or nested try block
//            {
//                        //risky code1
//            }
//            catch ()
//            {
//
//            }
//            //risky code 2
//        }
//        catch ()
//        {
//
//        }
    }
}
