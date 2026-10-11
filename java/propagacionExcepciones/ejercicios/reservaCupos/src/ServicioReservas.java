public class ServicioReservas {

    public void realizarReserva(Curso curso, int cantidad) throws CantidadInvalidaException, CuposNoDisponiblesException{
        curso.reservarCupo(cantidad);
    }
}
