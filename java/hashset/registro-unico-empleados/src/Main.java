import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Empleado>  empleados = new HashSet<>();


        empleados.add(new Empleado(1, "Alison"));
        empleados.add(new Empleado(2, "Carlos"));
        empleados.add(new Empleado(1, "Ana Maria"));
        empleados.add(new Empleado(3, "Carlos"));

        System.out.println("Empleados registrados: \n");

        for(Empleado emp : empleados){
            System.out.println(emp);
        }

        System.out.println("Total únicos: " + empleados.size());

    }
}