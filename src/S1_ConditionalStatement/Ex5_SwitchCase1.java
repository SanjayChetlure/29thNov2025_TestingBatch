package S1_ConditionalStatement;
public class Ex5_SwitchCase1
{
    public static void main(String[] args)
    {
        int inp=5;
        switch(inp)
        {
            case 1:
                System.out.println("Today is mon");
                break;
            case 2:
                System.out.println("Today is tue");
                break;
            case 3:
                System.out.println("Today is wed");
                break;
            case 4:
                System.out.println("Today is thr");
                break;
            case 5:
                System.out.println("Today is fri");
                break;
            case 6:
                System.out.println("Today is sat");
                break;
            case 7:
                System.out.println("Today is sun");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
