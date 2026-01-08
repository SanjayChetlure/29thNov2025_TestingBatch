package S1_ConditionalStatement;
public class Ex3_else_if2
{
    public static void main(String[] args)
    {
        int marks=32;

        // 32>=65
        if (marks>=65)
        {
            System.out.println("Distinction");
        }
        else if (marks>=60 & marks<65)   // 32>=60 & 64<65
        {
            System.out.println("1st class");
        }
        else if(marks>=50 & marks<60)      //32>=50 & 56<60
        {
            System.out.println("2nd class");
        }
        else if(marks>=35 & marks<50)      //32>=35 & 46<50
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
