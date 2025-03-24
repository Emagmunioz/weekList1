import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dev.week.Semana;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class semanaTest {
    private Semana gestor;
    @BeforeEach
    public void setUp() {
        gestor = new Semana();
        gestor.crearListaDias();
    }
    @Test
    public void testCrearListaDias() {
        List<String> dias = gestor.obtenerDiasSemana();
        assertThat(dias, hasSize(7));
        assertThat(dias, containsInAnyOrder("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));

    }
    
    }
