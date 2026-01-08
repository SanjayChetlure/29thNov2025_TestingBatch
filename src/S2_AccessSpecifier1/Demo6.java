package S2_AccessSpecifier1;

public class Demo6
{
    protected int num3;    //protected access specifier

    protected Demo6()       //protected access specifier
    {
        num3=30;
    }

    protected void m3()
    {
        System.out.println(num3);
    }


    public static void main(String[] args) {
        Demo6 d6=new Demo6();
        d6.m3();
        System.out.println(d6.num3);
    }
}
