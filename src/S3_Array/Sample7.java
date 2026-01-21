package S3_Array;
public class Sample7
{
    public static void main(String[] args)
    {
        //  0  1   2
        //0 10 20 30
        //1 40 50 60

        int [][] ar=new int[2][3];

        ar[0][0]=10;
        ar[0][1]=20;
        ar[0][2]=30;
        ar[1][0]=40;
        ar[1][1]=50;
        ar[1][2]=60;

        System.out.println(ar.length);
        System.out.println(ar[1][2]);

        System.out.println("----print all data-----");

        //           2<=1
        for(int i=0; i<=1; i++)                     //1: outer for loop -> rows
        {
            //
            for(int j=0; j<=2; j++)                 //2: Inner for loop -> cols
            {   //                  1  2
                System.out.print(ar[i][j]+ " ");     //3: print data using print stat
            }

            System.out.println();                    //4: create empty println() stat -> jump cursor to next line
        }


        //10 20 30
        //40 50 60
        //

    }
}
