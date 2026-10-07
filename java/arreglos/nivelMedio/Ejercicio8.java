package arreglos.nivelMedio;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arreglo = {123,324,234,4352,231,3123};

        System.out.print("Ingrese el número que desea buscar: ");
        int numBuscar = sc.nextInt();
        int pos = 0;
        boolean posEncontrada = false;

        for(int i = 0; i <arreglo.length; i++){
            if(numBuscar == arreglo[i]){
                pos = i;
                posEncontrada = true;
                break;
            }
        }
        if (posEncontrada){
            System.out.print("La posición de " + numBuscar + " es: " + pos);
        } else {
            System.out.println("El número ingresado no está en el arreglo");
        }

        sc.close();

    }
}
