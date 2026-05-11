package S3_LogicalProgram;
public class String_ex3_ReverseEvenOddIndexWords
{
    public static void main(String[] args)
    {
        String s1="my name is abc";      // ym eman si cba
        String [] ar=s1.split(" ");      // {my(0), name(1), is(2), abc(3)}

        //           3<=3
        for(int i=0; i<=ar.length-1; i++)
        {
            String org = ar[i];     //abc

            //3%2= 1==0
            if(i%2!=0)   //
            {
                String revValue = reverseString(org);
                System.out.print(revValue+" ");      //
            }
            else
            {
                System.out.print(org+" ");      //
            }

            //ym name si abc
        }
    }

    //ym name


    public static String reverseString(String org)
    {
        String rev="";
        for(int j=org.length()-1; j>=0; j--)
        {
            rev=rev+org.charAt(j);
        }
        return rev;
    }
}