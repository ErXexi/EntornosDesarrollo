package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {
    @Test
    void contarVocalesHolaMundo() {
        int resultadoReal = Vocales.contarVocales("Hola Mundo");
        int resultadoEsperado = 4;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void contarVocalesEstoEsunacadenA() {
        int resultadoReal = Vocales.contarVocales("Esto Es una cadenA");
        int resultadoEsperado = 8;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void contarVocalesJavamolaMogollOn() {
        int resultadoReal = Vocales.contarVocales("“Java mola MogollOn”");
        int resultadoEsperado = 7;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void contarVocales4h0r4s0nnum3r0s() {
        int resultadoReal = Vocales.contarVocales("4h0r4 s0n num3r0s");
        int resultadoEsperado = 1;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void contarVocalesCadenaS1nVocales() {
        int resultadoReal = Vocales.contarVocales("Cadena S1n Vocales”");
        int resultadoEsperado = 6;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void sinVocalesHolaMundo() {
        String resultadoReal = Vocales.sinVocales("Hola Mundo");
        String resultadoEsperado = "Hl Mnd";

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void sinVocalesEstoEsunacadenA() {
        String resultadoReal = Vocales.sinVocales("Esto Es una cadenA");
        String resultadoEsperado = "st s n cdn";

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void sinVocalesJavamolaMogollOn() {
        String resultadoReal = Vocales.sinVocales("Java mola MogollOn");
        String resultadoEsperado = "Jv ml Mglln";

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void sinVocales4h0r4s0nnum3r0s() {
        String resultadoReal = Vocales.sinVocales("4h0r4 s0n num3r0s");
        String resultadoEsperado = "4h0r4 s0n nm3r0s";

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void sinVocalesCadenaSinVocales() {
        String resultadoReal = Vocales.sinVocales("Cadena Sin Vocales");
        String resultadoEsperado = "Cdn Sn Vcls";

        assertEquals(resultadoEsperado, resultadoReal);
    }





}