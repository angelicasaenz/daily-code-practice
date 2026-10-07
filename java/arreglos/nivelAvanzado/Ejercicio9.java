package arreglos.nivelAvanzado;

public class Ejercicio9 {
    public static void main(String[] args) {

        int[] arreglo = {34,341,3432,3242,32};
        int[] invertido = new int[arreglo.length];

        int contador = 0;

        System.out.println("Arreglo invertido:");
        for(int i = arreglo.length-1; i >= 0; i--){
            invertido[contador] = arreglo[i];
            contador++;
        }

        for (int i = 0; i < invertido.length; i++) {
            System.out.println(invertido[i]);
        }



    }
}
