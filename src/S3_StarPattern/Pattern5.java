package S3_StarPattern;

public class Pattern5
{
    public static void main(String[] args)
    {
        //*
        //**
        //***

    int star=1;
    //           4<=3
    for(int i=1; i<=3; i++)
    {    //          4<=3
        for(int j=1; j<=star; j++)
        {
            System.out.print("*");
        }
        star++;                        //4
        System.out.println();
    }
    }
}
