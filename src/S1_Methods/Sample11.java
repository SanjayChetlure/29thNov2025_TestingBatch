package S1_Methods;
public class Sample11
{

    //method with 2 String parameter (String, String) parameter
    public static void studentFullName(String fn,String ln)     //fn=abc2, ln=xyz2
    {
        System.out.println("Firstname: "+fn);
        System.out.println("lastname: "+ln);
    }


    public static void studentInfo(String name,int rollNum,float per,char grade)
    {
        System.out.println("Student Name:-"+name);
        System.out.println("Student Roll Num:-"+rollNum);
        System.out.println("Student Percentage:-"+per);
        System.out.println("Student Grade:-"+grade);
    }


    public static void main(String[] args)
    {
        studentFullName("abc1","xyz1");
        System.out.println("---");
        studentFullName("abc2","xyz2");

        System.out.println("-------------------");

        studentInfo("Amol",101,65.1f,'A');
        System.out.println("---");
        studentInfo("Mahesh",102,56.2f,'B');

    }
}
