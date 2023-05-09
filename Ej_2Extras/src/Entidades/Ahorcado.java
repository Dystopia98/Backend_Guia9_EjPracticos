package Entidades;

public class Ahorcado {
    private String[] palabra;
    private int letras;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int intentos) {
        this.palabra = palabra;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    
    
}
