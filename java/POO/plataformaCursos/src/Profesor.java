public class Profesor {

    private Long id;
    private String nombre;
    private int edad;

    // Constructor
    public Profesor(Long id, String nombre, int edad){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    // getters
    public Long getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int edad(){
        return edad;
    }
    // setters
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setEdad(int nuevaEdad){
        this.edad = nuevaEdad;
    }
    // toString
    @Override
    public String toString(){
        return  "Id: " + id +
                "Profesor: " + nombre +
                "Edad: " + edad;

    }
}
