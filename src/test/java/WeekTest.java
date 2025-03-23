import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;
public class WeekTest {
    @Test
    void testGetWeekdays() {
        ManagerWeek manager = new ManagerWeek();
        List<String> days = manager.getWeekdays();
        assertThat(days, hasSize(7));
    }
  
}
