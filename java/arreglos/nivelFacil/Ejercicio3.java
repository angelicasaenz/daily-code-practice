package arreglos.nivelFacil;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Inicializar arreglo
        double notas[] = new double[4];

        // Recorrer arreglo para ingresar notas
        double suma = 0;
        for(int i = 0; i< notas.length; i++){
            System.out.print("Ingrese la nota #" + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }

        // Calcular y mostrar promedio

        double promedio = suma/notas.length;
        System.out.println("Su promedio de notas es: " + promedio);

        sc.close();

    }
}
