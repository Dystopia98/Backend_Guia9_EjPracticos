import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;
/**
 * 1.Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una
 *  frase(String) y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar
 *  getters y setters. El constructor con frase como atributo debe setear la longitud de la frase de
 *  manera automática. Crear una clase CadenaServicio en el paquete servicios que implemente los
 *  siguientes métodos :
 * --- a)Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
 *        ingresada.
 * --- b)Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
 *        ejemplo: Entrada: "Casa blanca", Salida: " acnalb asaC".
 * --- c)Metodo vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
 *        contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 *       Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
 * --- d)Metodo compararLongitud(String frase), deberá comparar la longitud de la frase que
 *        compone la clase con otra nueva frase ingresada por el usuario.
 * --- e)Método unirFrase(String frase), deberá unir la frase contenida en la clase Cadena
 *        con una nueva frase ingresada por el usuario y mostrar la frase resultante.
 * --- f)Metodo reemplazar(String letra), deberá reemplazar todas las letras "a" que se
 *        encuentren en la frase, por algún otro carácter seleccionado por el usuario
 *        y mostrar la frase resultante.
 * --- g)Metodo contiene(string letra), deberá comprobar si la frase contiene una letra
 *        que ingresa el usuarioy devuelve verdadero si la contiene y falso si no.
 */
public class Ej_1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String F1, F2, L1, L2, L3;
        CadenaServicio Cad = new CadenaServicio();
        Cadena C1 = Cad.crearCadena();
        System.out.println("----------*----------");
        System.out.println("     VOCALES");
        System.out.println("Tiene "+Cad.mostrarVocales(C1)+" vocales.");
        System.out.println("----------*----------");
        System.out.println("     INVERTIR");
        System.out.println(Cad.invertirFrase(C1));
        System.out.println("----------*----------");
        System.out.println("     REPETIDOS");
        System.out.print("Ingresar caracter a buscar : ");
        L1 = leer.nextLine();
        System.out.println("El caracter se encontro "+Cad.vecesRepetido(C1, L1)+" veces.");
        System.out.println("----------*----------");
        System.out.println("     COMPARAR LONGITUD");
        System.out.print("Frase para comparar : ");
        F1 = leer.nextLine();
        Cad.compararLongitud(C1, F1);
        System.out.println("----------*----------");
        System.out.println("     UNIR FRASES");
        System.out.println("Frase para unir : ");
        F2 = leer.nextLine();
        System.out.println("Resultado : ");
        System.out.println(Cad.unirFrases(C1, F2));
        System.out.println("----------*----------");
        System.out.println("     REEMPLAZAR");
        System.out.print("Carácter a reemplazar : ");
        L2 = leer.nextLine();
        System.out.print("Resultado : ");
        System.out.println(Cad.reemplazar(C1, L2));
        System.out.println("----------*----------");
        System.out.println("     CONTIENE");
        System.out.print("Carácter a buscar : ");
        L3 = leer.nextLine();
        System.out.println("Contiene "+L3+" : "+Cad.contiene(C1, L3));
    }
    
}
