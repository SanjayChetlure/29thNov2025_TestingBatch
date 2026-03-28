package S3_LogicalProgram;

public class Ex7_Swap2String_WithoutUsing_3rdVariable
{
    public static void main(String[] args)
    {

        String s1="abc";
        String s2="xyz";

        System.out.println("before swap s1: "+s1);
        System.out.println("before swap s2: "+s2);

        s1=s1+s2;      //abcxyz
        s2=s1.substring(0,(s1.length()-s2.length()));    // 0,(6-3)=3 -> abc
        s1=s1.substring(s2.length());  //3                        xyz

        System.out.println("after swap s1: "+s1);
        System.out.println("after swap s2: "+s2);

    }
}