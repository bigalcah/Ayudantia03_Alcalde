import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    Persona personaPrueba;
    int distancia;
    @BeforeEach
    void setUp() {
        personaPrueba = new Persona();
        distancia = 200;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void validarDistancia() {
        assertEquals(personaPrueba.validarDistancia(),distancia);
    }
}