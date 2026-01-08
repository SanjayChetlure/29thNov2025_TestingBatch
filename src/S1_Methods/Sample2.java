package S1_Methods;
public class Sample2
{
    //2: static regular method call from different/another class

    public static void main(String[] args)
    {
        System.out.println("hi");
        Sample3.m3();           //diffClassName.methodName();
        Sample3.m4();
        Sample3.m4();
    }
}
