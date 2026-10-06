import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private Long id;
    private String nombre;
    private List<Registro> registros;


    // constructor
    public Estudiante(Long id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.registros = new ArrayList<>();
    }

    // Relación de asociación con Registro (un estudiante puede tener de 0 a muchos registros)
    public void agregarRegistro(Registro registro){
        registros.add(registro);
    }

    // Getters

    public String getNombre(){
        return nombre;
    }
    public List<Registro> getRegistros(){
        return registros;
    }

    @Override
    public String toString(){
        return "Estudiante: " + nombre;
    }


}
