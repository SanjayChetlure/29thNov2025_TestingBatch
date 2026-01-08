package S2_AccessSpecifier1;
public class Demo9
{
    public int num4;

    public Demo9()
    {
        num4=40;
    }

    public void m4()
    {
        System.out.println(num4);
    }

    public static void main(String[] args)
    {
        Demo9 d9=new Demo9();
        d9.m4();
        System.out.println(d9.num4);
    }
}
