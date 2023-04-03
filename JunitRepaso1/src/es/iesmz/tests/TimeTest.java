package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void nextSecond121415() {
        Time t1 = new Time(12,14,15);
        Time resultadoReal = t1.nextSecond();
        Time resultadoEsperado = (new Time(12,14,16));


        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void nextSecond125944() {
        Time t1 = new Time(12,59,44);
        Time resultadoReal = t1.nextSecond();
        Time resultadoEsperado = (new Time(12,59,45));


        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void nextSecond1959() {
        Time t1 = new Time(1,9,59);
        Time resultadoReal = t1.nextSecond();
        Time resultadoEsperado = (new Time(1,10,0));


        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void nextSecond175959() {
        Time t1 = new Time(17,59,59);
        Time resultadoReal = t1.nextSecond();
        Time resultadoEsperado = (new Time(18,0,0));


        assertEquals(resultadoEsperado, resultadoReal);
    }
    @Test
    void nextSecond235959() {
        Time t1 = new Time(23,59,59);
        Time resultadoReal = t1.nextSecond();
        Time resultadoEsperado = (new Time(0,0,0));


        assertEquals(resultadoEsperado, resultadoReal);
    }



}