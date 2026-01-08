package S1_Constructor;
//1: example of default constructor
public class Sample1
{
    //default constructor -> provided by compiler
    //use1: copy all the members of class into object
//    Sample1()
//    {
//
//    }

    public void m1()
    {
        System.out.println("non-static method m1 from same class");
    }

    public static void main(String[] args)
    {
        //1: default constructor call from same class
        Sample1 s1=new Sample1();
        s1.m1();
        //1: Sample1 -> className -> as a dataType/objectType
        //2: s1 -> objectName -> use to identify/ref object
        //3: new -> keyword -> use to create blank/empty object
        //4: Sample1()  -> className() -> constructor call ->

        System.out.println("---------");

        //2: default constructor call from diff class
        Sample2 s2=new Sample2();
        s2.m2();
    }
}
