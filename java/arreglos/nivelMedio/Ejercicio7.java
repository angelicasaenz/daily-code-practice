package arreglos.nivelMedio;

public class Ejercicio7 {

    public static void main(String[] args) {

        int[] arreglo = {223,2323,3,2332,23,23,23,22321,344,4352};

        int contador = 0;
        for(int i = 0; i < arreglo.length; i++){
            if (arreglo [i] % 2 == 0){
                contador++;
            }
        }

        System.out.println("Cantidad de pares: "+ contador);

    }
}
