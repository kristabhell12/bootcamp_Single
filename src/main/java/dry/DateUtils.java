package dry;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateUtils {


    public void getData(String dateFromForm){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(dateFromForm, formatter);
        System.out.println(date);

    }
}
