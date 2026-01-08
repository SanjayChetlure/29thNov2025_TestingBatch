package S1_Methods;
public class Sample5
{
    //4: non-static method call from diff class

    public static void main(String[] args) {
        //1: create object of diff/another class   ->  DiffClassName objectName=new DiffClassName()
        //2: method call                     ->   objectName.methodName()

        Sample6 s6=new Sample6();
        s6.m7();
        s6.m8();
        s6.m8();
    }
}
