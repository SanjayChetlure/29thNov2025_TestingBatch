package S2_Interface_ImplementationClass;
public class Jio implements SimCard
{
    public void data()
    {
        System.out.println("data: 2GB");
    }

    public void ac()
    {
        System.out.println("audio calling : 200");
    }

    public static void main(String[] args) {
        Jio j=new Jio();
        j.ac();
        j.data();
        j.sms();
    }
}
