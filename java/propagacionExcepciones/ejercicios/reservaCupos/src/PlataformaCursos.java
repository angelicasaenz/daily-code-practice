public class PlataformaCursos {

    private ServicioReservas reserva;

    public PlataformaCursos(){
        this.reserva = new ServicioReservas();
    }

    public void solicitarReserva(Curso curso, int cantidad) throws CantidadInvalidaException, CuposNoDisponiblesException{
        reserva.realizarReserva(curso, cantidad);
    }
}
