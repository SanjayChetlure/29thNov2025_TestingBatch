//creating multiple classes in same java file

package S1_Methods;
public class Demo1
{
    public static void main(String[] args)
    {
        System.out.println("Hi");
        Demo2.m2();
        Demo3.m3();
    }
}

class Demo2
{
    public static void m2()
    {
        System.out.println("running static method m2 from Demo2 class");
    }
}

class Demo3
{
    public static void m3()
    {
        System.out.println("running static method m3 from Demo3 class");
    }
}
