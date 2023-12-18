package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexoTest {

    @Test
    void somaN() {
        Complexo complexo = new Complexo();
        assertEquals(61, complexo.somaN(51, 10));
    }

    @Test
    void somaC() {
        Complexo complexo = new Complexo();
        assertEquals(25, complexo.somaC(13, 12));
    }

    @Test
    void subtracaoN() {
        Complexo complexo = new Complexo();
        assertEquals(41, complexo.subtracaoN(51, 10));
    }

    @Test
    void subtracaoC() {
        Complexo complexo = new Complexo();
        assertEquals(1, complexo.subtracaoC(13, 12));
    }

    @Test
    void modulo() {
        Complexo complexo = new Complexo();
        assertEquals(14.832396974191326, complexo.modulo(51, 13));
    }
}