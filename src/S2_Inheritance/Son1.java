package S2_Inheritance;
//sub class 1
public class Son1 extends Father
{
    public void mobile()
    {
        System.out.println("mobile- Samsung S20 FE");
    }

//    public void car()
//    {
//        System.out.println("car - kia");
//    }
//
//    public void money()
//    {
//        System.out.println("money- 1L");
//    }
//
//    public void home()
//    {
//        System.out.println("home-2 bhk");
//    }


    public static void main(String[] args) {
        Son1 s1=new Son1();
        s1.mobile();
        s1.car();
        s1.money();
        s1.home();
    }

}
