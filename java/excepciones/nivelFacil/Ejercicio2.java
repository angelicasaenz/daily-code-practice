package excepciones.nivelFacil;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[] arreglo = {1, 2, 3, 4, 5};

        try{
            System.out.println("Ingrese la posición que desea consultar: ");
            int pos = sc.nextInt();
            System.out.println(arreglo[pos]);
            }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("La posición buscada se encuentra fuera del rango del arreglo.");
        }

        sc.close();
    }


}
