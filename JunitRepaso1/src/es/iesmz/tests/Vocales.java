package es.iesmz.tests;

public class Vocales {
    public static int contarVocales(String cadena){
        String aux = cadena.toUpperCase();
        aux.replace(" ", "");
        int contVocales = 0;
        for (int i = 0; i < aux.length(); i++) {
            if(aux.charAt(i) == 'A' || aux.charAt(i) == 'E' || aux.charAt(i) == 'I' || aux.charAt(i) == 'O' || aux.charAt(i) == 'U'){
                contVocales++;
            }
        }
        return contVocales;
    }

    public static String sinVocales(String cadena){
        String aux = cadena.replaceAll("[AEIOUÁÉÍÓÚaeiouáéíóú]", "");
        return aux;
    }
}
