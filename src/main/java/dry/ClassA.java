package dry;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ClassA {
    public String att1;
    public String att2;

    public void getData(String dateFromForm){

        DateUtils dateUtils = new DateUtils();
        dateUtils.getData(dateFromForm);
    }
}
