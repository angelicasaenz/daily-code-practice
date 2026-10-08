import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CuentaBancaria c1 = new CuentaBancaria(30000);

        try{
            //Leer Archivo
            FileReader fr = new FileReader("clientes.cvs");

            //Retirar
            System.out.println("Ingrese el monto a retirar: ");
            double monto = sc.nextDouble();

            c1.retirar(monto);

        } catch(FileNotFoundException e){
            System.out.println("No existe el archivo buscado");
        } catch(InputMismatchException e){
            System.out.println("El monto ingresado no es un número.");
        } catch(SaldoInsuficienteException e){
            System.out.println("Error: " + e.getMessage());
        }


    }
}