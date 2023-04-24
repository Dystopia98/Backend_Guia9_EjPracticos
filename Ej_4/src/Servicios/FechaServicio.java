package Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    Scanner leer = new Scanner(System.in);
    public Date fechaNacimiento(){
        Date X = new Date();
        System.out.println("Fecha de nacimiento : ");
        System.out.print("Dia : ");
        X.setDate(leer.nextInt());
        System.out.print("Mes : ");
        X.setMonth(leer.nextInt());
        System.out.print("Año : ");
        X.setYear(leer.nextInt());
        return X;
    }
    public Date fechaActual(){
        Date H = new Date();
        return H;
    }
    public void diferencia(Date F, Date H){
        int X=((H.getYear()+1900)-F.getYear());
        // LE SUMO 1900 AL AÑO, SINO ME REGRESA 123 Y EL AÑO ACTUAL ES 2023
        if(F.getMonth() > (H.getMonth()+1)){
            // LE SUMO 1 AL MES PORQUE ME REGRESA 3 Y EL MES DE LA FECHA ACTUAL ES 4
                X = X - 1;
        }
        if(F.getMonth() == (H.getMonth()+1)){
            // X.getDate() devuelve la fecha del dia.
            // X.getDay() devuelve el dia en la semana 1-7. por ejemplo
            //  si se ingresa 20 y es un miercoles,devuelve 3.
            if(F.getDate() > H.getDate()){
                // LE SUMO 16 AL DIA PORQUE REGRESA 4 Y EL DIA DE LA FECHA ES 20
                X = X - 1;
            }
        }
        System.out.println(X+" años de edad");
    }
}
