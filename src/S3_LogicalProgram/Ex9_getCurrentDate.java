package S3_LogicalProgram;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class Ex9_getCurrentDate
{
    public static void main(String[] args)
    {
//        System.out.println(LocalDate.now());

        Date date = new Date();
        SimpleDateFormat simpleDateFormatObj = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        System.out.println(simpleDateFormatObj.format(date));
    }
}