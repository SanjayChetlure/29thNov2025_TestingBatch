package S1_UseOfStatic_NonStatic;
public class EmpInformation
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        e1.empName="Amol";             //initialize variable from object
        e1.empID=101;
//        e1.empCEOName="ABC";
        Employee.empCEOName="ABC";

        Employee e2=new Employee();
        e2.empName="Rahul";
        e2.empID=102;
//        e2.empCEOName="ABC";
        Employee.empCEOName="ABC";

        Employee e3=new Employee();
        e3.empName="Shubham";
        e3.empID=103;
//        e3.empCEOName="XYZ";
        Employee.empCEOName="XYZ";

        e1.empInfo();
        e2.empInfo();
        e3.empInfo();
    }
}
