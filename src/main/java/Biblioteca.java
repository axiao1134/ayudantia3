import java.util.List;
import java.util.ArrayList;
public class Biblioteca {
    private String nombreBil;
    private String direccion;
    private List<Libros> listaLibros;

    // Constructor
    public Biblioteca(String nombreBil, String direccion) {
        this.nombreBil = nombreBil;
        this.direccion = direccion;
        this.listaLibros = new ArrayList<>();
    }
    public String getNombre() {
        return nombreBil;
    }

    public void setNombre(String nombrebil) {
        this.nombreBil = nombrebil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Libros> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libros> listaLibros) {
        this.listaLibros = listaLibros;
    }


}