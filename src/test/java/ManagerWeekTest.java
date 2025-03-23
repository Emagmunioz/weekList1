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
}
