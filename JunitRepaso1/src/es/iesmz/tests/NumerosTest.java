package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    @Test
    void numerosIguales4_55_7() {
        int resultadoReal = Numeros.sonIguales(4, 55, 7);
        int resultadoEsperado = 2;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void numerosIguales14_23_27() {
        int resultadoReal = Numeros.sonIguales(14, 23, 27);
        int resultadoEsperado = 2;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void numerosIguales14_55_14() {
        int resultadoReal = Numeros.sonIguales(14, 55, 14);
        int resultadoEsperado = 1;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void numerosIguales14_14_3() {
        int resultadoReal = Numeros.sonIguales(14, 14, 3);
        int resultadoEsperado = 1;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void numerosIguales32_55_55() {
        int resultadoReal = Numeros.sonIguales(32, 55, 55);
        int resultadoEsperado = 1;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void numerosIguales329_329_329() {
        int resultadoReal = Numeros.sonIguales(329, 329, 329);
        int resultadoEsperado = 0;

        assertEquals(resultadoEsperado, resultadoReal);
    }


}