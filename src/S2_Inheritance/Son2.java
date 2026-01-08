package S2_Inheritance;
//sub class 2
public class Son2 extends Father
{
    public void laptop()
    {
        System.out.println("laptop - HP Envy");
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
        Son2 s2=new Son2();
        s2.laptop();
        s2.car();
        s2.money();
        s2.home();
    }

}
