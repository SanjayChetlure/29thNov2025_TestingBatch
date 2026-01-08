package S1_Constructor;

public class Sample6
{
    int c;      //60
    int d;      //30

    //user defined constructor -> with parameter(2 int para)
    //use1: initialize global variables
    //use2: initialize object(copy variables & methods into object)
    Sample6(int num3, int num4)   //60, 30
    {
        c=num3;   //60
        d=num4;   //30
    }

    public void sub()
    {
        System.out.println(c-d);
    }

    public void div()
    {
        System.out.println(c/d);
    }

}
