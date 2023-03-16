package es.iesmz.tests;

import java.util.Arrays;

public class DiasLluvia {
    private static boolean[][] diasLluvia = new boolean[12][30];
    public boolean registraDia(int dia, int mes, boolean lluvia){
        //Registra que el dia (variables dia i mes) ha plogut (o no) (true or false). Retorna
        //false si no s'ha pogut registrar el dia.
        if(dia > 0 && dia <31 && mes >0 && mes <12){
            diasLluvia[mes][dia] = lluvia;
            return true;
        }else{
            return false;
        }
    }

    public boolean consultarDia(int dia, int mes){
        if(dia > 0 && dia <31 && mes >0 && mes <12){
            return diasLluvia[mes][dia];
        }else{
            return false;
        }
    }

    public int contarDiasLluviosos(){
        int cont = 0;
        for (int i = 0; i < diasLluvia.length; i++) {
            for (int j = 0; j < diasLluvia[0].length; j++) {
                if(diasLluvia[i][j] == true){
                    cont++;
                }
            }
        }
        return cont;
    }

    public int trimestreLluvioso(){
        int[] contMayor = new int[4];
        int mayor = 0;
        int mesGanador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < diasLluvia[0].length; j++) {
                if (diasLluvia[i][j] == true){
                    contMayor[0]++;
                }
            }
        }
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < diasLluvia[0].length; j++) {
                if (diasLluvia[i][j] == true){
                    contMayor[1]++;
                }
            }
        }
        for (int i = 6; i < 9 ; i++) {
            for (int j = 0; j < diasLluvia[0].length; j++) {
                if (diasLluvia[i][j] == true){
                    contMayor[2]++;
                }
            }
        }
        for (int i = 9; i < 11 ; i++) {
            for (int j = 0; j < diasLluvia[0].length; j++) {
                if (diasLluvia[i][j] == true){
                    contMayor[3]++;
                }
            }
        }
        mayor = contMayor[0];
        for (int i = 0; i < 4; i++) {
            if(contMayor[i] >= mayor){
                mayor = contMayor[i];
                mesGanador = i+1;
            }
        }
        return mesGanador;
    }

    public int primerDiaLluvia(){
        for (int i = 0; i < diasLluvia.length; i++) {
            for (int j = 0; j < diasLluvia[0].length; j++) {
                if(diasLluvia[i][j] == true){
                    return i*30+j+1;
                }
            }
        }
    return -1;
    }
}
