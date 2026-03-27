package S3_LogicalProgram;
public class Ex2_factorialOfNum
{
    public static void main(String[] args)
    {
        int num=4;     //4*3*2*1
        int fact=1;     //24

        //        4    0>=1   0
        for(int i=num; i>=1; i--)
        {
            fact=fact*i;     // 1*4= 4*3=12*2=24*1=24
        }

        System.out.println(fact);
    }
}