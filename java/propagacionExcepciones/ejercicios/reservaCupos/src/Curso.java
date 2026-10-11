public class Curso {

    private String nombre;
    private int cuposDisponibles;

    public Curso(String nombre, int cuposDisponibles){
        this.nombre = nombre;
        this.cuposDisponibles = cuposDisponibles;
    }

    public String getNombre(){
        return nombre;
    }
    public int getCuposDisponibles(){
        return cuposDisponibles;
    }

    public void reservarCupo(int cantidad) throws CantidadInvalidaException, CuposNoDisponiblesException{
        if(cantidad <= 0){
            throw new CantidadInvalidaException("Cantidad inválida. Debe ser mayor a 0");
        }
        if(cantidad > cuposDisponibles){
            throw new CuposNoDisponiblesException("Cupos insuficientes. Cantidad actual: " + cuposDisponibles);
        }
        cuposDisponibles -= cantidad;
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Inscripción de cupos exitosa en el curso " + nombre + ". Cantidad actual de cupos: "+ cuposDisponibles);
        System.out.println("------------------------------------------------------------------------------------------------------------");
    }
}
