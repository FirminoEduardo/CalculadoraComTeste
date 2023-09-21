package ucsal.br;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TesteCalculadora {
    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testarSoma() {
        assertEquals(5, calculadora.somar(2,3));
        assertEquals(-1, calculadora.somar(2, -3));
    }

    @Test
    public void testarSubtracao() {
        assertEquals(1, calculadora.subtrair(4, 3));
        assertEquals(7, calculadora.subtrair(10, 3));
    }

    @Test
    public void testarMultiplicacao() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(-12, calculadora.multiplicar(4, -3));
    }

    @Test
    public void testarDivisao() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertEquals(0, calculadora.dividir(0, 5));
    }

    @Test
    public void testarDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0));
    }
}
