package es.iesmz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {


    @org.junit.jupiter.api.Test
    void calculaSalarioBruto() {
    }

    @org.junit.jupiter.api.Test
    void calculaSalarioNeto() {
    }

    @Test
    public void testCalculaSalarioNeto1(){
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(2000f);
        float resultadoEsperado = 1640f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto2(){
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1500f);
        float resultadoEsperado = 1230f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto3(){
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1499.99f);
        float resultadoEsperado = 1259.9916f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
    @Test
    public void testCalculaSalarioNeto4(){
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1250f);
        float resultadoEsperado = 1050f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto5(){
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(1000);
        float resultadoEsperado = 840;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto6(){
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(999.99f);
        float resultadoEsperado = 999.99f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto7(){
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(500f);
        float resultadoEsperado = 500f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto8(){
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(0f);
        float resultadoEsperado = 0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioNeto9(){
        float resultadoReal = EmpleadoBR.calculaSalarioNeto(-1f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto2(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venenor, 1500.0f, 3.0f);
        float resultadoEsperado = 1260.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto3(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venenor, 1499.99f, 0.0f);
        float resultadoEsperado = 1100.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto4(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1250.0f, 8.0f);
        float resultadoEsperado = 1760.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto5(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 1000.0f, 0.0f);
        float resultadoEsperado = 1600.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto6(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 999.99f, 3.0f);
        float resultadoEsperado = 1560.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto7(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 500.0f, 0.0f);
        float resultadoEsperado = 1500.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto8(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.encarregat, 0.0f, 8.0f);
        float resultadoEsperado = 1660.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto9(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venenor, -1.0f, 8.0f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto10(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venenor, 1500.0f, -1.0f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }

    @Test
    public void testCalculaSalarioBruto11(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(null, 1500.0f, 8.0f);
        float resultadoEsperado = -1f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }


}