package S1_TypesOfVariable;
//3: example of non-static global variable
public class Sample4
{
    int num3=30;     //non-static global variable

    public void m1()
    {
        System.out.println(num3);
    }

    public static void m2()
    {
        Sample4 s4=new Sample4();
        System.out.println(s4.num3);
    }

    public static void main(String[] args)
    {
        //1: non-static global variable call from same class
        Sample4 s5=new Sample4();             //create object of same class
        System.out.println(s5.num3);          //objName.variableName

        System.out.println("----");

        //1: non-static global variable call from diff class
        Sample5 s6=new Sample5();             //create object of diff class
        System.out.println(s6.num4);          //objName.variableName
    }
}
