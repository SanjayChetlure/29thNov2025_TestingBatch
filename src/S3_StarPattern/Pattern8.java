package S3_StarPattern;
public class Pattern8
{
    public static void main(String[] args)
    {
        //*******
        //*****
        //***
        //*

        int star=7;
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=star; j++)
            {
                System.out.print("*");
            }
            star=star-2;                        //4
            System.out.println();
        }
    }
}
