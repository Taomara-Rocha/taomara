package com.example.aula23;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSimplesTest {

    CalculadoraSimples calc = new CalculadoraSimples();

    @Test
    public void deveSomar() {
        assertEquals(5, calc.soma(2, 3));
    }

    @Test
    public void deveDividir() {
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    public void deveLancarErroQuandoDividePorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
}