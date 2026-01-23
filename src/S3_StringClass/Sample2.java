package S3_StringClass;

public class Sample2
{
    public static void main(String[] args)
    {
        String s1="velocity";
        String s2="ABCD";
        String s3="abcd";
        String s4="my name is abc";
        String s5="abcd";

        System.out.println(s1.length());

//        s1=s1.toUpperCase();        //VELOCITY
//        System.out.println(s1);
        System.out.println(s1.toUpperCase());

//        s2=s2.toLowerCase();
        System.out.println(s2);
        System.out.println(s2.toLowerCase());

        System.out.println(s2.equals(s3));              //false -> compare data & case
        System.out.println(s2.equalsIgnoreCase(s3));    //true -> compare only data
        System.out.println("----");
        System.out.println(s4.contains("abc"));         //true
        System.out.println(s4.startsWith("my"));        //true
        System.out.println(s4.endsWith("abc"));         //true
        System.out.println("----");

        System.out.println(s5.isEmpty());       //
        System.out.println(s4.replace("abc","xyz"));    //my name is xyz








    }
}
