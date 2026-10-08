import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Por favor ingrese su edad: ");
            int edad = sc.nextInt();
            Edad e1 = new Edad(edad);
            e1.validarEdad();
            System.out.println("Bienvenido al sistema!");
        }catch(EdadInvalidaException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}