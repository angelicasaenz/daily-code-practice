package excepciones.nivelFacil;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio3 {
    public static void main(String[] args) {

        try {
            FileReader fd = new FileReader("datos.txt");
        } catch(FileNotFoundException e){
            System.out.println("El archivo no existe");
        }
    }
}
