package exercise3;

import java.time.DayOfWeek;

public class DateInfo {
    private int years;
    private int weekOfYear;
    private DayOfWeek weekDayOfBirth;

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getWeekOfYear() {
        return weekOfYear;
    }

    public void setWeekOfYear(int weekOfYear) {
        this.weekOfYear = weekOfYear;
    }

    public DayOfWeek getWeekDayOfBirth() {
        return weekDayOfBirth;
    }

    public void setWeekDayOfBirth(DayOfWeek weekDayOfBirth) {
        this.weekDayOfBirth = weekDayOfBirth;
    }

    @Override
    public String toString() {
        return "DateInfo{" +
                "years=" + years +
                ", weekOfYear=" + weekOfYear +
                ", weekDayOfBirth=" + weekDayOfBirth +
                '}';
    }
}
