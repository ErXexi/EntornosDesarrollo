package es.iesmz.tests;
public class Main {
    public static void main(String[] args) {
        DiasLluvia diasLluvia = new DiasLluvia();
        diasLluvia.registraDia(10,1,true);
        diasLluvia.registraDia(13,10, true);
        diasLluvia.registraDia(10, 8, true);
        diasLluvia.registraDia(8, 11, true);

        System.out.println("Consulta " + diasLluvia.consultarDia(13,10));
        System.out.println("Primer dia " + diasLluvia.primerDiaLluvia());
        System.out.println("Trimestre " + diasLluvia.trimestreLluvioso());
        System.out.println("Contar " + diasLluvia.contarDiasLluviosos());

    }
}