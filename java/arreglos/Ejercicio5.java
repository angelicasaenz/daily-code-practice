package arreglos;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear arreglo

        int[] numeros = {1,4,3342,4523,243,32,234,34};

        System.out.print("Ingrese el número que desea buscar: ");
        int numeroBuscar = sc.nextInt();

        boolean encontrado = false;

        for(int i = 0; i < numeros.length; i++){
            if(numeroBuscar == numeros[i]){
                encontrado = true;
                break;
            }
        }
        if(encontrado){
            System.out.println("Número encontrado");
        } else {
            System.out.println("Número no encontrado");
        }
        sc.close();
    }
}
