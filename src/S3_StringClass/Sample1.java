package S3_StringClass;

public class Sample1
{
    public static void main(String[] args) {

    String s1="abcd";

    //Object creation of String
        //1: without using new keyword
        String s2="xyz";

        //2: using new keyword
        String s3=new String("xyz1");


    //Declaration of String
        String s4;

    //Declaration & Initialization of String
        String s5="abc";

    //String Objects are Immutable in nature
        String str1="abc";

        str1="abcd";      //reinitialization

        str1="abcdXyz";   //reinitialization


    //String Pool Area
        //Object creation -> without new keyword [Constant pool area]
        String str2="abc";
        String str3="abc";
        String str4="abc1";

        //Object creation -> using new keyword [Non Constant pool area]
        String str5=new String("abc");
        String str6=new String("abc");
        String str7=new String("abc1");
    }
}
