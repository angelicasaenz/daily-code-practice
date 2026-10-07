package excepciones.nivelFacil;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println();
        System.out.print("Por favor ingrese el segundo número: ");
        int num2 = sc.nextInt();

        try {
            int div = num1 / num2;
            System.out.println("Resultado: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Un número entero no puede ser dividido por cero");
        }

        sc.close();

    }


}


