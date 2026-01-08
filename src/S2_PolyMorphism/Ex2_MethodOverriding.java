package S2_PolyMorphism;
public class Ex2_MethodOverriding
{
    public static void main(String[] args)
    {
        Father f=new Father();
        f.car();
        f.money();
        f.home();

        System.out.println("----");

        Son s=new Son();
        s.mobile();
        s.car();
        s.money();
        s.home();
    }
}
