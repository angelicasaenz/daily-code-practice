//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PlataformaCursos p = new PlataformaCursos();

        Curso c1 = new Curso("Java", 8);

        // Una reserva válida
        try{
            p.solicitarReserva(c1, 4);
        } catch(CantidadInvalidaException | CuposNoDisponiblesException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Una cantidad inválida
        try{
            p.solicitarReserva(c1, 0);
        } catch(CantidadInvalidaException | CuposNoDisponiblesException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Cupos insuficientes
        try{
            p.solicitarReserva(c1, 9);
        } catch(CantidadInvalidaException | CuposNoDisponiblesException e){
            System.out.println("Error: " + e.getMessage());
        }


    }

}