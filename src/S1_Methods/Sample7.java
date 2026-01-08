package S1_Methods;

public class Sample7
{
    //5: method without/zero parameter

    public static void main(String[] args)
    {
    //1: static method call from same class
        m1();           //methodName()

    //2: static method call from diff class
        Sample8.m3();       //diffClassName.methodName()

    //3: non-static method call from same class
        Sample7 s7=new Sample7();        //create object of same class
        s7.m2();

    //4: non-static method call from diff class
        Sample8 s8=new Sample8();
        s8.m4();
    }


    public static void m1()       //without parameter
    {
        System.out.println("static regular method m1 from same class");
    }

    public void m2()             //without parameter
    {
        System.out.println("non-static regular method m2 from same class");
    }
}
