package S2_this_super_keyword;
//sub class
public class Sample1 extends Sample2
{
//    int num1=30;    //global variable from super class

    int num1=20;           //global variable sub class

    public void m1()
    {
        int num1=10;        //local variable
        System.out.println(num1);         //call local variable
        System.out.println(this.num1);    //call global variable from same class
        System.out.println(super.num1);   //call global variable from super class
    }


    public static void main(String[] args) {
        Sample1 s1=new Sample1();
        s1.m1();
    }
}
