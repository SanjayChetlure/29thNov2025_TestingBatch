package S1_Constructor;
//4: example of multiple constructor in same class -> constructor overloading
public class Sample7
{
    int a;
    int b;
    String name;

    //without parameter constructor
    Sample7()
    {
        a=10;
        b=20;
    }

    //with(2 int) parameter constructor
    Sample7(int num1, int num2)
    {
        a=num1;
        b=num2;
    }

    //String parameter constructor
    Sample7(String s1)
    {
        name=s1;
    }

    public void getStudentName()
    {
        System.out.println(name);
    }

    public void add()
    {
        System.out.println(a+b);
    }

    public static void main(String[] args)
    {
        Sample7 s7=new Sample7();
        s7.add();

        System.out.println("--");

        Sample7 s8=new Sample7(5,6);
        s8.add();

        System.out.println("--");

        Sample7 s9=new Sample7("Amol");
        s9.getStudentName();
    }
}
