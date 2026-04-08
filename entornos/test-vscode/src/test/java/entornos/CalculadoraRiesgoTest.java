package entornos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraRiesgoTest {
    CalculadoraRiesgo calc = new CalculadoraRiesgo();

    @Test
    void testEdadNegativa() {
        assertEquals("Error", calc.evaluarEdad(-5));
    }

    @Test
    void testAdulto() {
        assertEquals("Adulto", calc.evaluarEdad(25));
    }
    
    @Test
    void testSenior() {
        // Un senior es mayor de 65 (por ejemplo 70)
        assertEquals("Senior", calc.evaluarEdad(70));
    }

    @Test
    void testLimiteDieciocho() {
        // En su código, < 18 es "Joven" y <= 65 es "Adulto". 
        // Por tanto, 18 exactos debería ser "Adulto"
        assertEquals("Adulto", calc.evaluarEdad(18));
    }
}

