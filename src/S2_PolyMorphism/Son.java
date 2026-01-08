package S2_PolyMorphism;

//method overriding
public class Son extends Father
{
    public void mobile()
    {
        System.out.println("mobile- Samsung S20 FE");
    }

    public void car()            //method overriding
    {
        System.out.println("car - BMW");
    }

    public void money()         //method overriding
    {
        System.out.println("money- 0.5L");
    }

//    public void home()
//    {
//        System.out.println("home-2 bhk");
//    }

}
