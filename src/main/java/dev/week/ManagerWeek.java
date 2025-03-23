package dev.week;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ManagerWeek() private ArrayList weekdays;

{
    this.weekdays = new ArrayList<>();
    initializeWeekdays();
}

private void initializeWeekdays() {
    weekdays.add("Monday");
    weekdays.add("Tuesday");
    weekdays.add("Wednesday");
    weekdays.add("Thursday");
    weekdays.add("Friday");
    weekdays.add("Saturday");
    weekdays.add("Sunday");

}