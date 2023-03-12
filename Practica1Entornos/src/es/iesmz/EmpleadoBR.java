package es.iesmz;

import static es.iesmz.TipoEmpleado.venenor;

public class EmpleadoBR {
    public static float calculaSalarioBruto(TipoEmpleado tipus, float ventasMes, float horasExtra){
        float salarioBruto = 0, prima = 0;
        if (tipus == TipoEmpleado.venenor){
            salarioBruto = 1000;
        }else{
            salarioBruto = 1500f;
        }

        if(ventasMes >= 1000 && ventasMes<1500){
            salarioBruto += 100f;
        }else if(ventasMes >= 1500f){
            salarioBruto += 200f;
        }

        salarioBruto += (horasExtra * 20f);
        if(tipus == null | ventasMes < 0 | horasExtra < 0){
            salarioBruto = -1;
        }
        return salarioBruto;
    }

    public static float calculaSalarioNeto(float salarioBruto){
        float salarioNeto = 0, retencion = 0;
        if(salarioBruto < 1000){
            retencion = 0;
        }
        if(salarioBruto >= 1000 & salarioBruto < 1500){
            retencion = 16;
        }else if(salarioBruto >= 1500){
            retencion = 18;
        }
        if(salarioBruto < 0){
            return -1;
        }else {
            return salarioBruto * (1 - retencion / 100);
        }

    }
}
