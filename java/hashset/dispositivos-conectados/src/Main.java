import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> dispositivos = new HashSet<>();

        dispositivos.add("DEV-100");
        dispositivos.add("DEV-200");
        dispositivos.add("DEV-300");
        dispositivos.add("DEV-100");
        dispositivos.add("DEV-400");
        dispositivos.add("DEV-500");
        dispositivos.add("DEV-100");
        dispositivos.add("DEV-200");
        dispositivos.add("DEV-600");

        System.out.println("Existe el dispositivo DEV-200? " + dispositivos.contains("DEV-200"));
        System.out.println("Existe el dispositivo DEV-300? " + dispositivos.contains("DEV-300"));
        System.out.println("Existe el dispositivo DEV-700? " + dispositivos.contains("DEV-700"));

        System.out.println("Dispositivos únicos conectados: " + dispositivos.size());


    }
}