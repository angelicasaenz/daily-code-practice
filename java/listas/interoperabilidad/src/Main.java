import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] colores = {"Rojo", "Verde", "Azul"};

        List<String> listaColores = new ArrayList<>(List.of(colores));

        listaColores.add("Amarillo");

        System.out.println(listaColores);
    }
}