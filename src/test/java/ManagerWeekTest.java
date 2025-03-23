import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ManagerWeekTest {
    private ManagerWeek managerWeek;
    @Before
    public void setUp() {
        managerWeek = new ManagerWeek();
        managerWeek.createDaysOfWeek();
    }
  
}
