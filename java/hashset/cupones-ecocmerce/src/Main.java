import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> cuponesUsados = new HashSet<>();

        String cupon;
        do {
            System.out.println("Ingrese el cupón: ");
            cupon = sc.nextLine();
            if(cuponesUsados.contains(cupon)){
                System.out.println("Cupón rechazado: ya fue usado\n");
            } else {
                System.out.println("Cupón aplicado correctamente\n");
                cuponesUsados.add(cupon);
            }
        } while(cuponesUsados.size() != 2);

        System.out.println("Cupones válidos registrados: "+ cuponesUsados);





    }
}