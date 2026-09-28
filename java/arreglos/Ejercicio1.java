package arreglos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declarar arreglo
        int[] arreglo = new int[5];

        // Recorrer arreglo para pedir datos
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingrese un número: ");
            arreglo[i] = sc.nextInt();
        }
        // Recorrer arreglo para mostrar datos
        System.out.println("El arreglo ingresado  es el siguiente: " + "\n");
        for(int i = 0; i < arreglo.length; i++){
            System.out.println(i+1 + ". " + arreglo[i]);
        }

        sc.close();
    }
}