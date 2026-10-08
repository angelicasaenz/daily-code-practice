package excepciones.nivelMedio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Ingrese el nombre del archivo que desea abrir: ");
            String nombreArch = sc.nextLine();
            FileReader fr = new FileReader(nombreArch);
            try{
                System.out.println("Ingrese el primer número: ");
                int num1 = sc.nextInt();
                System.out.println("Ingrese el segundo número: ");
                int num2 = sc.nextInt();
                int div = num1/num2;
                System.out.println("El resultado es: " + div);
                } catch (ArithmeticException e){
                System.out.println("Un número entero no se puede dividir por cero.");
            }
        }catch(FileNotFoundException e){
            System.out.println("No se encontró el archivo");
        }

        sc.close();
    }

}
