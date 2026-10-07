package arreglos.nivelFacil;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear arreglo
        int[] inverso = {1, 2, 3, 4, 5};

        // Recorrerlo desde la última posición hasta la primera
        System.out.println("Arreglo invertido: ");
        for(int i = inverso.length -1; i >= 0; i--){
            System.out.println(inverso[i]);
        }

        sc.close();


    }
}
