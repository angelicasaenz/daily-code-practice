package arreglos.nivelAvanzado;

public class Ejercicio11 {

    public static void main(String[] args) {

        // 1. Creamos y llenamos el arreglo de 6 números desordenados
        int[] numeros = {15, 3, 8, 1, 12, 5};

        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        // 2. Ciclos anidados para ordenar
        for (int i = 0; i < numeros.length - 1; i++) {       // Ciclo externo (pasadas)
            for (int j = 0; j < numeros.length - 1 - i; j++) { // Ciclo interno (comparaciones vecinas)

                // Si el número actual es MAYOR que el siguiente, se intercambian
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];        // Guardamos en la "mano extra"
                    numeros[j] = numeros[j + 1];  // Movemos el menor a la izquierda
                    numeros[j + 1] = aux;        // Pasamos el mayor a la derecha
                }

            }
        }

        System.out.println("\nArreglo ordenado de menor a mayor:");
        imprimirArreglo(numeros);
    }

    // Método auxiliar para mostrar los números en pantalla
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

