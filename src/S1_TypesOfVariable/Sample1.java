package S1_TypesOfVariable;
//1: example of local & global variable
public class Sample1
{
    int num3=30;           // global variable

    public void m1()
    {
        int num1=10;                      //local variable
        System.out.println(num1);    //10
        System.out.println(num3);    //30
    }

    public void m2(int num2)             //local variable
    {
        System.out.println(num2);     //20
        System.out.println(num3);     //30
    }

    public void m3()
    {
//        System.out.println(num1);    //no access
//        System.out.println(num2);    //no access
        System.out.println(num3);      //30
    }

    public static void main(String[] args)
    {
        Sample1 s1=new Sample1();
        s1.m1();
        s1.m2(20);
        s1.m3();
    }

}
