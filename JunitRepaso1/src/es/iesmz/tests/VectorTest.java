package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    @Test
    void vectorReverso123456() {
        int []v = {1,2,3,4,5,6};
        int []reverse = {6,5,4,3,2,1};
        String resultadoReal = Arrays.toString(Vector.reverso(v)) ;
        String resultadoEsperado = Arrays.toString(reverse) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void vectorReverso1012522167() {
        int []v = {10,12,5,221,6,7};
        int[]reverse = {7,6,221,5,12,10};

        String resultadoReal = Arrays.toString(Vector.reverso(v)) ;
        String resultadoEsperado = Arrays.toString(reverse) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void vectorReverso5() {
        int []v = {5};
        int []reverse = {5};
        String resultadoReal = Arrays.toString(Vector.reverso(v)) ;
        String resultadoEsperado = Arrays.toString(reverse) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    void vectorReverso51020() {
        int []v = {5,10,20};
        int []reverse = {20,10,5};
        String resultadoReal = Arrays.toString(Vector.reverso(v)) ;
        String resultadoEsperado = Arrays.toString(reverse) ;

        assertEquals(resultadoEsperado, resultadoReal);
    }



}