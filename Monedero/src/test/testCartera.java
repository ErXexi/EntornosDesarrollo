package test;
import clases.Cuenta;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCartera {
    @Test
    public void testSalarioAlCrearCuenta() {
        Cuenta c1 = new Cuenta();

        double resultadoEsperado = 0;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioAlIngresar100(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(100);

        double resultadoEsperado = 100;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioAlIngresar3000(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(3000);

        double resultadoEsperado = 3000;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioAlIngresar3000Y100(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(3000);
        c1.ingresa(100);

        double resultadoEsperado = 3100;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioAlIngresarNegativo(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(-5);

        double resultadoEsperado = 0;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioLimiteDecimales(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(100.45);

        double resultadoEsperado = 100.45;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioLimiteImporte1(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(6000.00);

        double resultadoEsperado = 6000.00;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioLimiteImporte2(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(6000.01);

        double resultadoEsperado = 0;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioRetirar(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(500);
        c1.retira(100);

        double resultadoEsperado = 400;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioRetirarMayorSaldo(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(200);
        c1.retira(500);

        double resultadoEsperado = 200;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioRetirarSalgoNegativo(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(500);
        c1.retira(-100);

        double resultadoEsperado = 500;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioRetirarLimiteDecimales(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(500);
        c1.retira(100.45);

        double resultadoEsperado = 399.55;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioRetirarLimite(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(6000);
        c1.ingresa(1000);
        c1.retira(6000);

        double resultadoEsperado = 1000;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioRetirarLimite1(){
        Cuenta c1 = new Cuenta();
        c1.ingresa(6000);
        c1.ingresa(1000);
        c1.retira(6000.01);

        double resultadoEsperado = 7000;
        double resultadoReal = c1.getSaldo();

        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testSalarioTransfiere(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresa(500);
        c2.ingresa(50);
        c1.transfiere(100, c2);

        double resultadoEsperadoC1 = 400;
        double resultadoEsperadoC2 = 150;
        double resultadoRealC1 = c1.getSaldo();
        double resultadoRealC2 = c2.getSaldo();

        assertEquals(resultadoEsperadoC1, resultadoRealC1);
        assertEquals(resultadoEsperadoC2, resultadoRealC2);
    }

    @Test
    public void testSalarioTransfiereNegativo(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresa(500);
        c2.ingresa(50);
        c1.transfiere(-100, c2);

        double resultadoEsperadoC1 = 500;
        double resultadoEsperadoC2 = 50;
        double resultadoRealC1 = c1.getSaldo();
        double resultadoRealC2 = c2.getSaldo();

        assertEquals(resultadoEsperadoC1, resultadoRealC1);
        assertEquals(resultadoEsperadoC2, resultadoRealC2);
    }

    @Test
    public void testSalarioTransfiereLimite(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresa(3500);
        c2.ingresa(50);
        c1.transfiere(3000, c2);

        double resultadoEsperadoC1 = 500;
        double resultadoEsperadoC2 = 3050;
        double resultadoRealC1 = c1.getSaldo();
        double resultadoRealC2 = c2.getSaldo();

        assertEquals(resultadoEsperadoC1, resultadoRealC1);
        assertEquals(resultadoEsperadoC2, resultadoRealC2);
    }

    @Test
    public void testSalarioTransfiereLimite2(){
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        c1.ingresa(3500);
        c2.ingresa(50);
        c1.transfiere(3000.01, c2);

        double resultadoEsperadoC1 = 3500;
        double resultadoEsperadoC2 = 50;
        double resultadoRealC1 = c1.getSaldo();
        double resultadoRealC2 = c2.getSaldo();

        assertEquals(resultadoEsperadoC1, resultadoRealC1);
        assertEquals(resultadoEsperadoC2, resultadoRealC2);
    }

}
