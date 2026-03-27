package S3_LogicalProgram;
public class Ex3_ReverseString
{
    public static void main(String[] args)
    {
     String org="abcd";
     String rev="";     //dcba

     //              4-1=3   -1>=0
    for(int i=org.length()-1; i>=0; i--)
    {
        rev=rev+org.charAt(i);    // "" + d= d + c=dc+b= dcb+a= dcba
    }

     System.out.println(rev);
    }
}