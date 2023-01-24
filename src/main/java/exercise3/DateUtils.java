package exercise3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;

public class DateUtils {
    public static DateInfo getDateInfo(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        DateInfo dateInfo = new DateInfo();
        dateInfo.setWeekOfYear(date.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR));
        dateInfo.setWeekDayOfBirth(date.getDayOfWeek());
        dateInfo.setYears(Period.between(date, LocalDate.now()).getYears());

        return dateInfo;
    }
}
