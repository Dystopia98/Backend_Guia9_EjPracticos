package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {
    Scanner leer = new Scanner(System.in);
    public Cadena crearCadena(){
        Cadena X = new Cadena();
        System.out.print("Frase principal : ");
        X.setFrase(leer.nextLine());
        return new Cadena(X.getFrase());
    }
    public int mostrarVocales(Cadena n){
        int cant = 0;
        String voc;
        for (int i = 0; i < n.getLongitud(); i++) {
            voc = n.getFrase().substring(i,i+1).toLowerCase();
            if(voc.equals("a")){
                cant = cant + 1 ;
            }
            if(voc.equals("e")){
                cant = cant + 1;
            }
            if(voc.equals("i")){
                cant = cant + 1;
            }
            if(voc.equals("o")){
                cant = cant + 1;
            }
            if(voc.equals("u")){
                cant = cant + 1;
            }
        }
        return  cant;
    }
    public String invertirFrase(Cadena n){
        String invertida = "";
        for (int i = 0; i < n.getLongitud(); i++) {
            invertida = invertida + n.getFrase().substring(n.getLongitud()-(i+1),n.getLongitud() - i);
        }
        return invertida;
    }
    public int vecesRepetido(Cadena n, String letra){
        int cant = 0;
        for (int i = 0; i < n.getLongitud(); i++) {
            if(n.getFrase().substring(i,i+1).toLowerCase().equals(letra.toLowerCase())){
                cant = cant + 1;
            }
        }
        return cant;
    }
    public void compararLongitud(Cadena n, String frase){
        if(frase.length() == n.getLongitud()){
            System.out.println("Frase con misma longitud.");
        }
        if(frase.length() > n.getLongitud()){
            System.out.println("La segunda frase es mas larga que la primera.");
        } 
        if(frase.length() < n.getLongitud()){
            System.out.println("La primera frase es mas larga que la segunda.");
        }
    }
    public String unirFrases(Cadena n, String frase){
        return n.getFrase() + " " + frase;
    }
    public String reemplazar(Cadena n, String letra){
        String X = "";
        for (int i = 0; i < n.getLongitud(); i++) {
            if(n.getFrase().substring(i,i+1).toLowerCase().equals("a")){
                X = X + letra;
            } else {
                X = X + n.getFrase().substring(i,i+1);
            }
        }
        return X;
    }
    public boolean contiene(Cadena n, String letra){
        int X = 0;
        for (int i = 0; i < n.getLongitud(); i++) {
           if(n.getFrase().substring(i).equals(letra)){
               X = X + 1;
           }
        }
        return X >= 1;
    }
    
}
