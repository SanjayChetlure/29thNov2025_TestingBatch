package S1_Methods;
public class Sample4
{
    //3: non-static method call from same class

    public static void main(String[] args)
    {
        //1: create object of current/same class   ->  className objectName=new className()
        //2: method call                     ->   objectName.methodName()
        Sample4 s4=new Sample4();
        s4.m5();
        s4.m6();
        s4.m6();

         //1: Sample4 -> className -> dataType / objectType
         //2: s4  -> objectName  -> use to identify/refer object  (user defined)
         //3: new   -> keyword -> use to create blank/empty object
         //4: Sample4() -> className() ->constructor -> use to copy all the members of class into object
    }

    //non-static regular method
    public void m5()
    {
        System.out.println("running non-static method m5 from same class");
    }

    //non-static regular method
    public void m6()
    {
        System.out.println("running non-static method m6 from same class");
    }

}
