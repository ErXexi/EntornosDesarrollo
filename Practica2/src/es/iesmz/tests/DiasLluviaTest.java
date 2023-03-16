package es.iesmz.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

import static org.junit.jupiter.api.Assertions.*;

class DiasLluviaTest {
    private DiasLluvia diasLluvia;
    @BeforeEach
    void instanciaDiasLluvia(){
        diasLluvia = new DiasLluvia();

        diasLluvia.registraDia(5,5, true);
        diasLluvia.registraDia(1,11, true);
        diasLluvia.registraDia(7, 10, false);
    }

    @Test
    void registraDia() {
        boolean resultadoReal = diasLluvia.registraDia(12, 3, true);
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void registraDia2() {
        boolean resultadoReal = diasLluvia.registraDia(5, 7, true);
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }



    @Test
    void registraDia3() {
        boolean resultadoReal = diasLluvia.registraDia(31, 3, true);
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
     void consultarDia() {
        boolean resultadoReal = diasLluvia.consultarDia(5, 5);
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void consultarDia2() {
        boolean resultadoReal = diasLluvia.consultarDia(5, 5);
        boolean resultadoEsperado = true;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void consultarDia3() {
        boolean resultadoReal = diasLluvia.consultarDia(7, 10);
        boolean resultadoEsperado = false;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void contarDiasLluviosos() {
        int resultadoReal = diasLluvia.contarDiasLluviosos();
        int resultadoEsperado = 5;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void contarDiasLluviosos2() {
        int resultadoReal = diasLluvia.contarDiasLluviosos();
        int resultadoEsperado = 7;

        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void contarDiasLluviosos3() {
        diasLluvia.registraDia(8,7,true);
        int resultadoReal = diasLluvia.contarDiasLluviosos();
        int resultadoEsperado = 4;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void contarTrimestreLluvioso(){
        int resultadoReal = diasLluvia.trimestreLluvioso();
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado,resultadoReal);
    }

    @Test
    void contarTrimestreLluvioso1(){
        int resultadoReal = diasLluvia.trimestreLluvioso();
        int resultadoEsperado = 2;
        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void primerDiaLluvia1(){
        int resultadoReal = diasLluvia.primerDiaLluvia();
        int resultadoEsperado = 103;
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void primerDiaLluvia2(){
        int resultadoReal = diasLluvia.primerDiaLluvia();
        int resultadoEsperado = 70;
        assertNotEquals(resultadoEsperado, resultadoReal);
    }

    @org.junit.jupiter.api.Test
    void trimestreLluvioso() {
    }

    @org.junit.jupiter.api.Test
    void primerDiaLluvia() {
    }
}