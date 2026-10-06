import java.util.ArrayList;
import java.util.List;

public class Leccion {

    private String titulo;
    private List<Video> videos;

    // constructor

    public Leccion(String titulo){
        this.titulo = titulo;
        this.videos = new ArrayList<>();
    }

    // Relación de composición
    public void agregarVideo(String nombre){
        videos.add(new Video(nombre));
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String nuevoTitulo){
        this.titulo = titulo;
    }
    public List<Video> getVideos(){
        return videos;
    }

    @Override
    public String toString(){
        return "Lección: " + titulo;
    }

}
