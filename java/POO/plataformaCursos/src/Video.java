public class Video {

    private String nombre;

    // Constructor
    public Video(String nombre){
        this.nombre= nombre;
    }
    // Get
    public String getNombre(){
        return nombre;
    }
    //Set
    public void setNombre(String nombreNuevo){
        this.nombre = nombreNuevo;
    }

    // toString
    @Override
    public String toString(){
       return "Video: " + nombre;
    }



}
