package arreglos.nivelAvanzado;

public class Ejercicio10 {

    public static void main(String[] args) {

        int [] arreglo = {12,32,234,21211,23, 3213};


        int numBorrar = 23;
        int pos = 0;
        for(int i = 0; i < arreglo.length; i++){

            if(numBorrar == arreglo[i]){
                pos = i;
                break;
            }
        }

        for(int i = pos; i < arreglo.length -1 ; i++){
            arreglo[i] = arreglo[i+1];;
        }
        arreglo[arreglo.length-1]=0;

        for(int i = 0; i < arreglo.length; i++){
            System.out.println(arreglo[i]);
        }

    }

    
}
