import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> bloqueadas = new HashSet<>();
        List<String> mensajesChat = new ArrayList<>();

        bloqueadas.add("spam");
        bloqueadas.add("hack");
        bloqueadas.add("fake");

        String palabra = "";

        do{
            System.out.print("Ingrese la palabra que desea ingresar en el chat: ");
            palabra = sc.nextLine();
            if(bloqueadas.contains(palabra)){
                System.out.println("Mensaje bloqueado: contiene palabra prohibida\n");
            } else {
                mensajesChat.add(palabra);
                System.out.println("Palabra permitida");
            }
        } while(mensajesChat.size() < 3);

        System.out.println("Mensajes enviados al chat: " + mensajesChat);
        System.out.println("Palabras bloqueadas: " + bloqueadas);


    }
}