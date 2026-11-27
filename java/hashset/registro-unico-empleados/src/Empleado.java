import java.util.Objects;

public class Empleado {

    private long id;
    private String nombre;

    public Empleado (long id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    // Getters
    public long getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    // Setters
    public void setId (long id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    @Override
    public String toString(){
        return "Empleado {id = " + this.id + ", nombre = " + this.nombre + "}";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado otro = (Empleado) o;
        return this.id == otro.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



}
