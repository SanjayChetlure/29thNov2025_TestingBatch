package S3_MethodWithReturnType;
public class Sample3
{
    public static void main(String[] args)
    {
       String s1=studentName();
       System.out.println(s1);


       System.out.println(studentName());
    }

    public static String studentName()
    {
        String name="Rutuja";
        return name;
    }
}
