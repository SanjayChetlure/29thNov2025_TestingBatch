package S1_ConditionalStatement;
public class Ex4_nestedIf2
{
    public static void main(String[] args)
    {
        int shoppingAmt=3000;

        //3000>=500
        if (shoppingAmt>=500)          //outer if
        {
            System.out.println("free delivery");
            //  3000>=2000
            if (shoppingAmt>=2000)         //inner/nested if
            {
                System.out.println("Additional 10% discount");
            }
        }
        else
        {
            System.out.println("Rs 50 - delivery charges applied");
        }
    }
}
