import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    Auto autoPrueba;
    float distancia;
    float tiempoEsperado;

    @BeforeEach
    void setUp() {
        autoPrueba = new Auto();
        distancia = 200f;
        tiempoEsperado = 200f / autoPrueba.velocidad;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void tiempoEnLlegar() {
        assertEquals(autoPrueba.tiempoEnLlegar(200), tiempoEsperado);
    }
}