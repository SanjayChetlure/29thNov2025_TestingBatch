package S2_Casting;
public class TestUpCasting
{
    public static void main(String[] args)
    {
//        Son s=new Son();
//        s.mobile();
//        s.car();
//        s.money();
//        s.home();

        //Create object of Sub class with ref/dataType of super class - up Casting
      Father f=new Son();
      f.car();
      f.money();
      f.home();
//      f.mobile();

    }
}
