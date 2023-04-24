package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosServicio {

    public ParDeNumeros crearNumeros() {
        ParDeNumeros X = new ParDeNumeros();
        return X;
    }

    public void mostrarValores(ParDeNumeros n) {
        System.out.println("Valor 1 : " + n.getNumero1());
        System.out.println("Valor 2 : " + n.getNumero2());
    }

    public void devolverMayor(ParDeNumeros n) {
        if (n.getNumero1() > n.getNumero2()) {
            System.out.println(n.getNumero1() + " > " + n.getNumero2());
        }
        if (n.getNumero1() < n.getNumero2()) {
            System.out.println(n.getNumero1() + " < " + n.getNumero2());
        }
        if (n.getNumero1() == n.getNumero2()) {
            System.out.println(n.getNumero1() + " = " + n.getNumero2());
        }
    }

    public void calcularPotencia(ParDeNumeros n) {
        int n1 = (int) Math.round(n.getNumero1());
        int n2 = (int) Math.round(n.getNumero2());
        if (n1 >= n2) {
            System.out.println("Potencia " + n2 + " de " + n1 + " = " + ((int) Math.pow(n1, n2)));
        }
        if (n2 > n1) {
            System.out.println("Potencia " + n1 + " de " + n2 + " = " + ((int) Math.pow(n2, n1)));
        }
    }

    public void calcularRaiz(ParDeNumeros n) {
        int n1 = Math.abs((int) Math.round(n.getNumero1()));
        int n2 = Math.abs((int) Math.round(n.getNumero2()));
        if (n1 >= n2) {
            System.out.println("2√" + n2 + " = " + (Math.sqrt(n2)));
        }
        if (n2 > n1) {
            System.out.println("2√" + n1 + " = " + (Math.sqrt(n1)));
        }
    }
}
