import java.util.ArrayList;
import java.util.List;

public class Curso {

    private Long id;
    private String nombre;
    private List<Leccion> lecciones; // Composición
    private Profesor profesor; // Asociación
    private List<Registro> registros; // Asociación

    public Curso(Long id, String nombre, Profesor profesor){
        this.id=id;
        this.nombre = nombre;
        this.profesor = profesor;
        this.lecciones = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    public Curso(Long id, String nombre){
        this.id=id;
        this.nombre = nombre;
        this.lecciones = new ArrayList<>();
        this.registros = new ArrayList<>();
    }

    // Relación de asociación con Profesor (Un curso tiene un profesor)
    public void asignarProfesro(Profesor profesor){
        this.profesor = profesor;
    }

    // Relación de composición con lecciones (un curso puede tener de 0 a muchas lecciones)
    public void agregarLeccion(String titulo){
        lecciones.add(new Leccion(titulo));
    }

    // Relación de asociación con Registro
    public void agregarRegistro(Registro registro){
        registros.add(registro);
    }

    // getters
    public Long getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public List<Leccion> getLecciones(){
        return lecciones;
    }
    public List<Registro> getRegistros(){
        return registros;
    }
    public Profesor getProfesor(){
        return profesor;
    }

    @Override
    public String toString(){
        return "Curso: " + nombre + " dictado por: " + profesor;

    }

}
