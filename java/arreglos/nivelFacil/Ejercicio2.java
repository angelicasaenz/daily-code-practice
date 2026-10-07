package arreglos.nivelFacil;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declarar arreglo
        int[] arregloSuma = new int[6];

        // Recorrer arreglo para llenarlo
        for(int i = 0; i < arregloSuma.length; i++){
            System.out.println("Ingrese un número: ");
            arregloSuma[i] = sc.nextInt();
        }

        // Recorrer arreglo y sumarlo
        int suma = 0;
        for(int i = 0; i < arregloSuma.length; i++){
            suma += arregloSuma[i];
        }

        // Imprimir suma
        System.out.println("La suma del arreglo es: " + suma);

        sc.close();
    }
}


