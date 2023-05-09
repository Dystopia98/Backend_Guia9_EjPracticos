package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;


public class AhorcadoServicio {
    Scanner leer = new Scanner(System.in);
    Ahorcado X = new Ahorcado();
    public Ahorcado crearJuego(){
        String P;
        System.out.print("Palabra a adivinar : ");
        P = leer.nextLine();
        String[] Palabra = new String[P.length()];
        for (int i = 0; i < P.length(); i++) {
            Palabra[i] = P.substring(i,i+1);
        }
        X.setPalabra(Palabra);
        System.out.print("Intentos : ");
        X.setIntentos(leer.nextInt());
        X.setLetras(X.getPalabra().length);
        return X;
    }
    private int longitud(){
        return X.getPalabra().length;
    }
    private void buscar(String l){
        boolean T = 0 == 0;
        for (int i = 0; i < longitud(); i++) {
            if(X.getPalabra()[i].toLowerCase().equals(l.toLowerCase())){
                T = true;
                break;
            }else{
                T = false;
            }
        }
        if(T == true){
            System.out.println("La letra está en la palabra.");
        } else {
            X.setIntentos(X.getIntentos()-1);
            System.out.println("La letra no está en la palabra.");
        }
    }
    private boolean encontradas(String l){
        int c = 0;
        for (int i = 0; i < longitud(); i++) {
            if(X.getPalabra()[i].toLowerCase().equals(l.toLowerCase())){
                c = c++;
            }
        }
        if(c >= 1){
            if(c == 1){
                System.out.println("Se encontró 1 vez la letra en la palabra.");
                X.setLetras(X.getLetras()-1);
                System.out.println("Faltan "+X.getLetras()+" por encontrar.");
            }else{
                System.out.println("Se encontró "+c+" veces la letra en la palabra.");
                X.setLetras(X.getLetras()-c);
                System.out.println("Faltan "+X.getLetras()+" por encontrar.");
            }
        }
        return (c >= 1);
    }
    private void intentos(){
        if(X.getIntentos() == 1){
            System.out.println("Último intento.");
        }else{
            System.out.println(X.getIntentos()+" intentos restantes.");
        }
        if(X.getIntentos() == 0){
            System.out.println("¡Fin del juego!");
        }  
    }
    private void ganador(){
        System.out.println("       !Felicidades¡");
        System.out.println("  Has adivinado la palabra");
    }
    private void perdedor(){
        System.out.println("No has logrado adivinar la palabra.");
        System.out.println("  !Buena suerte para la próxima¡");
    }
    
    public void juego(){
        String R;
        int C;
        crearJuego();
        String[] P = new String[longitud()];
        for (int i = 0; i < longitud(); i++) {
            P[i] = "-";
        }
        do{
            System.out.print("Letra : ");
            R = leer.next();
            buscar(R);
            encontradas(R);
            intentos();
            for (int i = 0; i < longitud(); i++) {
                if(X.getPalabra()[i].toLowerCase().equals(R.toLowerCase())){
                    P[i] = X.getPalabra()[i];
                }
                
                System.out.print(P[i]+" ");
            }
            C = 0;
            for (int i = 0; i < longitud(); i++) {
                if(P[i].toLowerCase().equals(X.getPalabra()[i].toLowerCase())){
                    C = C + 1;
                }
            }
            if(X.getIntentos() > 1){
                System.out.println("");
            }
            System.out.println("");
            System.out.println("________________________________");
            
        }while(X.getIntentos() > 0 && X.getLetras() > 0 && C != longitud());
        
        if(C == longitud()){
            ganador();
            System.out.print("          ");
            for (int i = 0; i < longitud(); i++) {
                System.out.print(X.getPalabra()[i].toUpperCase());
            }
            System.out.println("");
        }else{
            perdedor();
            System.out.println("     Palabra escondida :");
            System.out.print("          ");
            for (int i = 0; i < longitud(); i++) {
                System.out.print(X.getPalabra()[i].toUpperCase());
            }
            System.out.println("");
        }
    }
}
