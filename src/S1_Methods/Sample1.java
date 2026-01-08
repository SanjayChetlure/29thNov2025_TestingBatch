package S1_Methods;
public class Sample1
{
    //1: static regular method call from same/current class

    //main method (pre-defined)
    public static void main(String[] args)      //main method declaration
    {
        //main method body
        System.out.println("main method started");
          m1();               //methodName()
          m2();
          m2();
        System.out.println("main method ended");
    }

    //static - regular method (user defined)
    public static void m1()
    {
        System.out.println("running static regular method-m1");
    }

    //static - regular method
    public static void m2()
    {
        System.out.println("running static regular method-m2");
    }
}
