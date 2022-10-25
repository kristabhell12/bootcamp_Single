package dry;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ClassB {
    public String Att1;
    public String Att2;

    public void getData(String dateFromForm){

        DateUtils dateUtils = new DateUtils();
        dateUtils.getData(dateFromForm);
    }

}
