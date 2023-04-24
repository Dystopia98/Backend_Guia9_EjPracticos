package Entidades;

public class ParDeNumeros {
    private double numero1;
    private double numero2;

    public ParDeNumeros() {
        numero1 = (Math.random()*10)+1;
        numero2 = (Math.random()*10)+1;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
}
