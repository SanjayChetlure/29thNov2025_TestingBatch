package S1_ConditionalStatement;

public class Ex4_Nested_if
{
    public static void main(String[] args)
    {

    int PEM=150;

    // 150>=250
    if (PEM>=250)      //outer if
    {
        System.out.println("Selected in Prelim exam");
        System.out.println("Preparing for mains exam");
        int MEM=450;
        //450>=500
        if(MEM>=500)      //inner or nested if
        {
            System.out.println("Selected in mains exam");
        }
        else
        {
            System.out.println("Rejected in mains exam");
        }
    }
    else
    {
        System.out.println("Rejected in Prelim exam");
    }

    }
}
