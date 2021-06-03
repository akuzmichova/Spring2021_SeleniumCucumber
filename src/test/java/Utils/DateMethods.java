package Utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateMethods {

    public static String getCurrentDateWithFormat(String pattern) {
        Date currentTimeDate = new Date();
        SimpleDateFormat df = new SimpleDateFormat(pattern);
        return df.format(currentTimeDate);
    }

}