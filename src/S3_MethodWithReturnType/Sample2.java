package S3_MethodWithReturnType;
public class Sample2
{
    public static void main(String[] args) {

        String[] ar1 = studentNames();
        System.out.println(ar1[0]);
    }

    public static String [] studentNames()
    {
        String [] ar={"ganesh","mahesh","suresh"};
        return ar;
    }
}
