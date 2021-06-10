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

    List<String> timeDataPointsFromCalendar = new ArrayList<>();

    public List<String> getTimeLineFromCalendar() {
        Calendar currentCalendar = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("ha");
        for (int i = 0; i < 11; i++) {
            currentCalendar.add(Calendar.HOUR, 2);
            String formattedCurrentTime = df.format(currentCalendar.getTime());
            timeDataPointsFromCalendar.add(formattedCurrentTime.toLowerCase());
        }
        return timeDataPointsFromCalendar;
    }


}