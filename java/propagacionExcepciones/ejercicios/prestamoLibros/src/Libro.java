public class Libro {

    private String titulo;
    private int cantidadDisponible;

    public Libro(String titulo, int cantidadDisponible){
        this.titulo = titulo;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void prestar(int cantidad) throws CantidadInvalidaException, LibroNoDisponibleException{
        if(cantidad <= 0){
            throw new CantidadInvalidaException("Cantidad ingresada inválida. Debe ser mayor a 0");
        }
        if(cantidad > cantidadDisponible){
            throw new LibroNoDisponibleException("No hay suficientes unidades de " + titulo + " para préstamo. Cantidad actual: " + cantidadDisponible);
        }
        cantidadDisponible -= cantidad;
        System.out.println("----------------------------------");
        System.out.println("Préstamo exitoso de: " + titulo + ".");
        System.out.println("Cantidad nueva: " + cantidadDisponible);
        System.out.println("----------------------------------");
    }

}
