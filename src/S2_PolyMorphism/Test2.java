package S2_PolyMorphism;

public class Test2 extends Test1
{

    Test2()
    {

    }
    

    public static void m1()       //method hiding
    {
        System.out.println("static method m1 sub class");
    }

    public static void main(String[] args)
    {
        m1();
    }
}
