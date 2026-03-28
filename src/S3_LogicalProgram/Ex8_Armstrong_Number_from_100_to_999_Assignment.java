package S3_LogicalProgram;

public class Ex8_Armstrong_Number_from_100_to_999_Assignment
{
    public static void main(String[] args)
    {
        int OrgNum = 120;     //1 + 125 + 27= 153
        int sum = 0;

        //            153     0>0   i=153/10=15/10=1/10=0
        for (int i = OrgNum;  i > 0;  i=i/10)
        {
            int rem = i % 10;    //1 % 10 = 1
            sum = sum + (rem * rem * rem);        //sum= 27 + 125 = 152 + 1=153
        }

        if (OrgNum == sum)
        {
            System.out.println("given number " + OrgNum + " is an armstrong number");
        }
        else
        {
            System.out.println("given number " + OrgNum + " is not an armstrong number");
        }
    }
    // find Armstrong_Number from 100 to 999
}