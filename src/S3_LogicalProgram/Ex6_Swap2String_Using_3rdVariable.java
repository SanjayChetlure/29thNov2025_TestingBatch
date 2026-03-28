package S3_LogicalProgram;

public class Ex6_Swap2String_Using_3rdVariable
{
    public static void main(String[] args)
    {

        String s1="abc";
        String s2="xyz";

        System.out.println("before swap s1: "+s1);
        System.out.println("before swap s2: "+s2);

        String temp=s1;    //abc
        s1=s2;            //xyz
        s2=temp;          //abc

        System.out.println("after swap s1: "+s1);
        System.out.println("after swap s2: "+s2);

    }
}