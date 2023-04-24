package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class ServicioCurso {
    Scanner leer = new Scanner(System.in);
    public String[] cargarAlumnos(){
        String[] S = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"° : ");
            S[i]= leer.nextLine();
        }
        return S;
    }
    public Curso crearCurso(){
        Curso X = new Curso();
        System.out.print("Nombre del curso : ");
        X.setNombreCurso(leer.nextLine());
        System.out.println("Lista de alumnos ");
        X.setAlumnos(cargarAlumnos());
        System.out.print("Turno (Mañana o Tarde): ");
        X.setTurno(leer.nextLine());
        if(!X.getTurno().toLowerCase().equals("mañana") && !X.getTurno().toLowerCase().equals("tarde")){
            X.setTurno("Indefinido.");
        }
        System.out.print("Precio por hora : $");
        X.setPrecioPorHora(leer.nextDouble());
        System.out.print("Cantidad de horas por dia : ");
        X.setCantidadHorasPorDia(leer.nextInt());
        System.out.print("Cantidad de dias a la semana : ");
        X.setCantidadDiasPorSemana(leer.nextInt());
        return new Curso(X.getNombreCurso(),X.getCantidadHorasPorDia(),X.getCantidadDiasPorSemana(),X.getTurno(),X.getPrecioPorHora(),X.getAlumnos());
    }
    public double calcularGananciaSemanal(Curso n){
        return (n.getPrecioPorHora()*n.getCantidadHorasPorDia()*n.getCantidadDiasPorSemana()*5);
    } 
}
