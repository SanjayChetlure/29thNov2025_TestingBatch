package S3_LogicalProgram;
public class String_ex4_removeDigitFromString
{
    public static void main(String[] args)
    {
        String str="5abcd123xyz #";   // out  -> abcdxyz #
        String str1="";  //ab

        //	         2<=
        for(int i=0; i<=str.length()-1; i++)
        {
            char s1 = str.charAt(i);  //b

            //
            if(!Character.isDigit(s1))  //a
            {
                str1=str1+s1;  //    a+b=ab
            }
        }

        System.out.println(str1);
    }
}