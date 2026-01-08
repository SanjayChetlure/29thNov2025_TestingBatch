package S1_TypesOfVariable;
//2: example of static global variable
public class Sample2
{
    static int num1=10;         //static global variable

    public static void m1()
    {
        System.out.println(num1);          //variableName
    }

    public void m2()
    {
        System.out.println(num1);        //variableName
    }

    public static void main(String[] args)
    {
        //1: static global variable call from same class
        System.out.println(num1);        //variableName

        //2: static global variable call from diff class
        System.out.println(Sample3.num2);       //diffClassName.variableName
    }
}
