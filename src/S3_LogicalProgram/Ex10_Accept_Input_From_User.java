package S3_LogicalProgram;
import java.util.Scanner;
public class Ex10_Accept_Input_From_User
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        //to accept String input - call next()
//        System.out.print("Enter Student Name: ");
//        String s1 = scan.next();
//        System.out.println(s1.length());
//
//        System.out.print("Enter Student Name2: ");
//        String s2 = scan.next();
//        System.out.println(s2.toUpperCase());

        //to accept int input - call nextInt()
		System.out.print("Enter Num1: ");
		int num1=scan.nextInt();            //accept int input from user

		System.out.print("Enter Num2: ");
		int num2=scan.nextInt();

		System.out.println(num1+num2);


        //to accept int input - call nextInt()
        System.out.print("Enter Percentage: ");
        float per = scan.nextFloat();
        System.out.println(per);



    }
}