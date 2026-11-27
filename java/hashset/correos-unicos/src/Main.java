import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> correos = new HashSet<>();

        correos.add("ana@gmail.com");
        correos.add("carlos@gmail.com");
        correos.add("ana@gmail.com");

        System.out.println("Correos registrados: ");
        for(String correo : correos){
            System.out.println(correo);
        }

        System.out.println("Total únicos: " + correos.size());

    }
}