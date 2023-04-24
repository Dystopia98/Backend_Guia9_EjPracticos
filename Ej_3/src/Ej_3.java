
import Servicios.ArregloServicio;

/**
 *                               Clase Arrays
 * Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números
 *  reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
 * --- Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
 * --- Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
 * --- Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 * --- Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego
 *      llenar las últimas 10 posiciones del arreglo B con 0.5.
 * ----- En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
public class Ej_3 {

    public static void main(String[] args) {
        double[] A = new double[50];
        double[] B = new double[20];
        ArregloServicio Array = new ArregloServicio();
        Array.inicializarA(A);
        System.out.println("                          _________");
        System.out.println("                          |   A   |");
        System.out.println("                          ---------");
        Array.mostrar(A);
        Array.ordenar(A);
        Array.inicializarB(A,B);
        System.out.println("                _______________________________");
        System.out.println("                | A Ordenado de menor a mayor |");
        System.out.println("                -------------------------------");
        Array.mostrar(A);
        System.out.println("                          _________");
        System.out.println("                          |   B   |");
        System.out.println("                          ---------");
        Array.mostrar(B);
    }
    
}
