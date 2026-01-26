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
        String s6="abcabca";
        String s7=" xyz abc ";


        System.out.println(s7.trim());
        System.out.println(s7);

        System.out.println("----");
        System.out.println(s2.concat(s3));     //ABCDabcd
        System.out.println(s2+s3);            //ABCDabcd

        System.out.println(s1.substring(3,6));            //oci
        System.out.println(s1.substring(4));      //city

        System.out.println("-----");
        System.out.println(s6.lastIndexOf('b'));   //4
        System.out.println(s6.indexOf('b'));    //1
        System.out.println(s1.charAt(1));       //e

        System.out.println("------------------------------");

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
