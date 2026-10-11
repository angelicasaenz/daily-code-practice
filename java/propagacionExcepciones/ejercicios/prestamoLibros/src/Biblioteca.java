public class Biblioteca {

    public void procesarPrestamo(Libro libro, int cantidad) throws CantidadInvalidaException, LibroNoDisponibleException{
        libro.prestar(cantidad);
    }
}
