//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro("Los hermanos Karamazov", 5);
        Libro l2 = new Libro("Crimen y castigo", 3);
        Libro l3 = new Libro("Cien años de soledad", 8);

        Biblioteca b1 = new Biblioteca();

        // Cantidad no disponible
        try{
            b1.procesarPrestamo(l1, 9);
        } catch (CantidadInvalidaException | LibroNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Cantidad inválida
        try{
            b1.procesarPrestamo(l2, 0);
        } catch (CantidadInvalidaException | LibroNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Préstamo exitoso
        try{
            b1.procesarPrestamo(l3, 1);
        } catch (CantidadInvalidaException | LibroNoDisponibleException e) {
            System.out.println("Error: " + e.getMessage());
        }




    }
}