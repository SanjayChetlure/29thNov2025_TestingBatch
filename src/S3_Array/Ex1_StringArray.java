package S3_Array;
public class Ex1_StringArray
{
    public static void main(String[] args)
    {
        //1: Array Declaration
        String [] ar=new String[5];

        //2: Array Initialization
        ar[0]="Ramesh";
        ar[1]="ganesh";
        ar[2]="Mahesh";
        ar[3]="Suresh";
        ar[4]="Rahul";

        //3: Array Usage
        System.out.println(ar[2]);   //Mahesh
        System.out.println(ar.length);    //5

        //reinitialize value
        ar[1]="Ganesh";
        System.out.println(ar[1]);

        System.out.println("---Print all data from array--");
        //           4<=4
//        for(int i=0; i<=4; i++)
//        {
//            System.out.println(ar[i]);   //ar[0]
//        }

        for(int i=0; i<=ar.length-1; i++)
        {
            System.out.println(ar[i]);   //ar[0]
        }
    }
}
