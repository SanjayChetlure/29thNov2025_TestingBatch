package S1_Constructor;
//3: example of user defined with parameter constructor
public class Sample5
{
    int a;    //10
    int b;    //20

    //user defined constructor -> with parameter(2 int para)
    //use1: initialize global variables
    //use2: initialize object(copy variables & methods into object)
    Sample5(int num1, int num2)        //num1=10, num2=20
    {
        a=num1;   //10            //globalVariable=localVariable
        b=num2;   //20
    }

    public void add()
    {
        System.out.println(a+b);
    }

    public void mult()
    {
        System.out.println(a*b);
    }

    public static void main(String[] args) {

        Sample5 s5=new Sample5(10,20);
        s5.add();
        s5.mult();

        System.out.println("--");

        Sample5 s6=new Sample5(7,8);
        s6.add();
        s6.mult();

        System.out.println("--");

        Sample5 s7=new Sample5(4,3);
        s7.add();
        s7.mult();

        System.out.println("-------------------");

        Sample6 s8=new Sample6(60,30);
        s8.sub();
        s8.div();

        Sample6 s9=new Sample6(100,75);
        s9.sub();
        s9.div();
    }
}
