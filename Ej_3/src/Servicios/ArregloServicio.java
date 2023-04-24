package Servicios;

import java.util.Arrays;

public class ArregloServicio {
    public double[] inicializarA(double[] n){
        for (int i = 0; i < n.length; i++) {
            n[i] = ((double)((int)(Math.random()*1000)))/100;
        }
        return n;
    }
    public void mostrar(double[] n){
        for (int i = 0; i < n.length; i++) {
            if(i == 9 || i == 19 || i == 29 || i == 39 || i == 49){
                System.out.println(n[i]);
            } else {
                System.out.print(n[i]+" | ");
            }
        }
    }
    public void ordenar(double[] n){
        Arrays.sort(n);
    }
    public double[] inicializarB(double[] n, double[] m){
        for (int i = 0; i < 10; i++) {
            m[i] = n[i];
        }
        Arrays.fill(m,10,19,0.5);
        return m;
    }
}
