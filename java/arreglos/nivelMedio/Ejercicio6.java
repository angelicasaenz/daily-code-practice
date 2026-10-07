package arreglos.nivelMedio;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[7];
        int numMayor = numeros[0];
        // Leer números
        System.out.println("A continuación va a ingresar 7 números y se determinará cual es el mayor");
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > numMayor){
                numMayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + numMayor);

        sc.close();


    }
}
