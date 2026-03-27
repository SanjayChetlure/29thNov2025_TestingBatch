package S3_LogicalProgram;
public class Ex4_ReversePalindrome
{
    public static void main(String[] args)
    {
        String org="madam";
        String rev="";

        for(int i=org.length()-1; i>=0; i--)
        {
            rev=rev+org.charAt(i);    // "" + d= d + c=dc+b= dcb+a= dcba
        }

       if(org.equals(rev))
       {
           System.out.println("given string is palindrome");
       }
       else
       {
           System.out.println("given string is not palindrome");
       }
    }
}