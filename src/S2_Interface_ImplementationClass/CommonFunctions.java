package S2_Interface_ImplementationClass;
public interface CommonFunctions
{
    public static void captureSS()
    {
        System.out.println("running code to capture ss");
    }

    public static void getDataFromExcel()
    {
        getExcelPath();
        System.out.println("running code to getDataFromExcel");
    }

    public static void writeDataInExcel()
    {
        getExcelPath();
        System.out.println("running code to writeDataInExcel");
    }

    private static void getExcelPath()
    {
        System.out.println("get excel path");
    }
}
