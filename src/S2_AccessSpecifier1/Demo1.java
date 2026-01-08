package S2_AccessSpecifier1;

public class Demo1
{
    private int num1;          //private variable

    private Demo1()            //private constructor
    {
        num1=10;
    }

    private void squareOfNum()      //private method
    {
        System.out.println(num1*num1);
    }


    public static void main(String[] args)
    {
        Demo1 d1=new Demo1();
        d1.squareOfNum();
        System.out.println(d1.num1);
    }
}
