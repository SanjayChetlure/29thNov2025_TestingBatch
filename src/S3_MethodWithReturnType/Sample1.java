package S3_MethodWithReturnType;

public class Sample1
{
    public static void main(String[] args)
    {
         int num1=add(10,20);
         System.out.println(num1*num1);

        System.out.println(add(5,4));

        System.out.println("-----");

        int num2= mult();
        System.out.println(num2-5);

        System.out.println(mult());

        System.out.println("---------------------");

        Sample1 s1=new Sample1();
        int num3=s1.sub(30,22);
        System.out.println(num3);

        System.out.println(s1.sub(30,21));
    }


    //method with int return type
    public static int add(int a, int b)
    {
        int addValue=a+b;                 //10+20=30
        return addValue;
    }


    //method with int return type
    public static int mult()
    {
        int a=10;
        int b=20;
        return a*b;
    }


    public int sub(int a, int b)
    {
        return a-b;     //30-22 =8
    }
}
