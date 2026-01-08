package S2_AccessSpecifier1;

public class Demo3
{
    int num2;     //default access specifier

    Demo3()      //default access specifier
    {
        num2=20;
    }

    void m1()          //default access specifier
    {
        System.out.println(num2);
    }


    public static void main(String[] args)
    {
        Demo3 d3=new Demo3();
        d3.m1();
        System.out.println(d3.num2);
    }
}
