import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import dev.week.ManagerWeek;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ManagerWeekTest {
    private ManagerWeek managerWeek;
    @BeforeAll
    public void setUp() {
        managerWeek = new ManagerWeek();
        managerWeek.createDaysOfWeek();
    }
    @Test
    public void testCreateDaysOfWeek() {
        List<String> expectedDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        assertThat(managerWeek.getDaysOfWeek(), is(expectedDays));
    }
    @Test
    public void testGetDaysOfWeek() {
        List<String> days = managerWeek.getDaysOfWeek();
        assertThat(days, hasSize(7));
        assertThat(days, hasItems("Monday", "Sunday"));
    }
    @Test
    public void testGetDaysOfWeekSize() {
        assertThat(managerWeek.getDaysOfWeekSize(), is(7));
    }
    @Test
    public void testRemoveDay() {
        managerWeek.removeDay("Monday");
        assertThat(managerWeek.getDaysOfWeek(), not(hasItem("Monday")));
        assertThat(managerWeek.getDaysOfWeekSize(), is(6));
    }
    @Test
    public void testGetDay() {
        assertThat(managerWeek.getDay(0), is("Monday"));
        assertThat(managerWeek.getDay(6), is("Sunday"));
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetDayOutOfBounds() {
        managerWeek.getDay(7);
    }
    @Test
    public void testContainsDay() {
        assertThat(managerWeek.containsDay("Tuesday"), is(true));
        assertThat(managerWeek.containsDay("InvalidDay"), is(false));
    }
    @Test
    public void testSortDaysAlphabetically() {
        managerWeek.sortDaysAlphabetically();
        List<String> sortedDays = Arrays.asList("Friday", "Monday", "Saturday", "Sunday", "Thursday", "Tuesday", "Wednesday");
        assertThat(managerWeek.getDaysOfWeek(), is(sortedDays));
    }
    @Test
    public void testClearDaysOfWeek() {
        managerWeek.clearDaysOfWeek();
        assertThat(managerWeek.getDaysOfWeekSize(), is(0));
    }
    
}
