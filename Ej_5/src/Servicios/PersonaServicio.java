package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        Persona X = new Persona();
        Date F = new Date();
        System.out.print("Nombre : ");
        X.setNombre(leer.nextLine());
        System.out.println("Fecha de nacimiento");
        System.out.print("Dia : ");
        F.setDate(leer.nextInt());
        System.out.print("Mes : ");
        F.setMonth(leer.nextInt());
        System.out.print("Año : ");
        F.setYear(leer.nextInt());
        System.out.println("_________________________________________________");
        X.setFecha(F);
        return new Persona(X.getNombre(),X.getFecha());
    }
    private int calcularEdad(Persona n){
        Date H = new Date();
        int edad = (H.getYear()+ 1900) - n.getFecha().getYear();
        if(n.getFecha().getMonth() > (H.getMonth() + 1)){
            edad = edad - 1;
        }
        if(n.getFecha().getMonth() == (H.getMonth() + 1900)){
            if(n.getFecha().getDay() > (H.getDay() + 16)){
                edad = edad - 1;
            }
        }
        
        return edad;
    }
    private boolean menorQue(Persona n, int M){
        return (calcularEdad(n)>=M);
    }
    public void mostrarPersona(Persona n){
        System.out.println("Nombre : "+ n.getNombre());
        System.out.println("Edad : "+calcularEdad(n));
        System.out.println("Fecha de nacimiento : "+n.getFecha().getDate()+"/"+n.getFecha().getMonth()+"/"+n.getFecha().getYear());
        System.out.println("Mayor de edad : "+menorQue(n,18));
    }
}
