package dev.week;
import java.util.ArrayList;
import java.util.List;

public class ManagerWeek {
    private List<String> daysOfWeek;

    public ManagerWeek() {
        this.daysOfWeek = new ArrayList<>();
    }
    public void createDaysOfWeek() {
        daysOfWeek.clear();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
    }
    public List<String> getDaysOfWeek() {
        return new ArrayList<>(daysOfWeek);
    }
    public int getDaysOfWeekSize() {
        return daysOfWeek.size();
    }
    public void removeDay(String day) {
        daysOfWeek.remove(day);
    }
    public String getDay(int index) {
        if (index >= 0 && index < daysOfWeek.size()) {
            return daysOfWeek.get(index);
        }
        throw new IndexOutOfBoundsException("Index is out of bounds");
    }
    public boolean containsDay(String day) {
        return daysOfWeek.contains(day);
    }

}