package excepciones.nivelMedio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();
            int div = num1 / num2;
            System.out.println("El resultado es: " + div);
        } catch(ArithmeticException e){
            System.out.println("Un número entero no se puede dividir por cero");
        } catch(InputMismatchException e){
            System.out.println("Solo se pueden ingresar números");
        }

        sc.close();
    }
}
