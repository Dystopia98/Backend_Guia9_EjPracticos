package Servicios;

import Entidad.Juego;
import java.util.Scanner;

public class JuegoServicio {
    Scanner leer = new Scanner(System.in);
    public Juego crearJ(){
        String[] S = new String[12];
        Juego X = new Juego();
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0:
                    S[i] = "enero";
                    break;
                case 1:
                    S[i] = "febrero";
                    break;
                case 2:
                    S[i] = "marzo";
                    break;
                case 3:
                    S[i] = "abril";
                    break;
                case 4:
                    S[i] = "mayo";
                    break;
                case 5:
                    S[i] = "junio";
                    break;
                case 6:
                    S[i] = "julio";
                    break;
                case 7:
                    S[i] = "agosto";
                    break;
                case 8:
                    S[i] = "septiembre";
                    break;
                case 9:
                    S[i] = "octubre";
                    break;
                case 10:
                    S[i] = "noviembre";
                    break;
                default:
                    S[i] = "diciembre";
                    break;
            }
        }
        X.setMes(S);
        return new Juego(X.getMes());
    }
    private int mesSecreto(){
        return (int)((Math.random()*7)+(Math.random()*6));
    }
    public void Jugar(Juego n){
        String R,MesSecreto = n.getMes()[mesSecreto()];
        int I = 0;
        System.out.println("¡Adivine el mes secreto!");
        do{
        System.out.println(MesSecreto+"Mes : ");
        R = leer.nextLine();
        if(!R.equals(MesSecreto)){
            I = I + 1;
            System.out.println(" Vuelva a intentarlo...");
        }else{
            System.out.println("________________________________________");
            System.out.println(" ¡Has adivinado el mes!");
            System.out.println("--- Mes secreto : "+MesSecreto);
            System.out.println("--- Intentos fallados : " +I);
            R = MesSecreto;
        }
            System.out.println("________________________________________");
        }while (!R.equals(MesSecreto));
    }
}
