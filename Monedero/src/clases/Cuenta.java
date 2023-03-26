package clases;

public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean ingresa(double ingreso){
        if(ingreso >0 && ingreso <= 6000) {
            saldo = saldo + (((double)Math.round(ingreso * 100d) / 100d) );
        }
        return true;
    }

    public boolean retira(double retirada){
        if(retirada>saldo || retirada <0 || retirada >6000){
            retirada = 0;
        }
        saldo = saldo - retirada;
        return true;
    }

    public boolean transfiere(double cantidad,Cuenta c2){
        if(cantidad <= 3000) {
            retira(cantidad);
            c2.ingresa(cantidad);
        }
        return true;
    }
}
