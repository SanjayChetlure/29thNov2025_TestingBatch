package S1_Constructor;
//2: Example of user defined without parameter constructor
public class Sample3
{
    //1; declare variable globally
    int a;    //10
    int b;    //20

    //2: initialize global variable within user defined constructor
    //user defined constructor -> provided by user
    //use1: initialize global variables
    //use2: initialize object (copy all the members of class into objects)
    Sample3()
    {
        a=10;                //initialization
        b=20;
    }

    //3: call/use global variables within methods
    public void add()
    {
        System.out.println(a+b);
    }

    public void mult()
    {
        System.out.println(a*b);
    }

    public static void main(String[] args)
    {
        //1: user defined constructor call from same class
        Sample3 s3=new Sample3();
        s3.add();
        s3.mult();

        System.out.println("----");

        //2: user defined constructor call from diff class
        Sample4 s4=new Sample4();
        s4.sub();
        s4.div();
    }

}
