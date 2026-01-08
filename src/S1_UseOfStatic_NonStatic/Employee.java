package S1_UseOfStatic_NonStatic;
public class Employee
{
    String empName;
    int empID;
//   String empCEOName;
    static String empCEOName;



    public void empInfo()
    {
        System.out.println(empName+ " : "+empID+ " : "+empCEOName);
    }
}
