package S2_Inheritance;
public class Ex4_HierarchicalInheritance
{
    public static void main(String[] args)
    {
        System.out.println("----Features of Son1----");
        Son1 s1=new Son1();
        s1.mobile();
        s1.car();
        s1.money();
        s1.home();

        System.out.println("----Features of Son2----");
        Son2 s2=new Son2();
        s2.laptop();
        s2.car();
        s2.money();
        s2.home();

        System.out.println("----Features of Son3----");
        Son3 s3=new Son3();
        s3.bike();
        s3.car();
        s3.money();
        s3.home();

    }
}
