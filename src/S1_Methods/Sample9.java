package S1_Methods;

//6: method with parameter
public class Sample9
{


    //with parameter (2 int parameter)
    public static void add(int num1, int num2)      //num=100, num=200
    {
        System.out.println(num1+num2);       //30+40=70
    }

    //with parameter (1 int parameter)
    public void squareOfNum(int num)     //num=30
    {
        System.out.println(num*num);       //30*30=900
    }

    public static void main(String[] args)
    {
        add(10,20);
        add(30,40);
        add(100,200);

        System.out.println("-----");
        Sample9 s9=new Sample9();
        s9.squareOfNum(5);
        s9.squareOfNum(9);
        s9.squareOfNum(30);

        System.out.println("------------------------------");

        Sample10.sub(80,65);
        Sample10.sub(10,25);

        Sample10 s10=new Sample10();
        s10.div(60,20);
        s10.div(4,2);

    }
}
