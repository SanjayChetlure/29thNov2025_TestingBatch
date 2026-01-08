package S1_Constructor;

public class Sample4
{
    int c;     //30
    int d;     //40


    //user defined constructor-> provided by user
    //use1: initialize global variables
    //use2: initialize object(copy all the members of class into object)
    Sample4()
    {
      c=30;
      d=40;         //initialization
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
