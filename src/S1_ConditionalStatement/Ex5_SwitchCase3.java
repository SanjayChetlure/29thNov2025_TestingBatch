package S1_ConditionalStatement;
public class Ex5_SwitchCase3
{
    public static void main(String[] args)
    {
        String inp="AA";

        switch (inp)
        {
            case "CD":
                System.out.println("running CD code");
                break;
            case "CW":
                System.out.println("running CW code");
                break;
            case "MS":
                System.out.println("running MS code");
                break;
            case "BI":
                System.out.println("running BI code");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
