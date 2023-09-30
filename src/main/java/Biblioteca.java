import java.util.List;
import java.util.ArrayList;
public class Biblioteca {
    private String nombre;
    private String direccion;
    private List<Libros> listaLibros;

    // Constructor
    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaLibros = new ArrayList<>();
    }

}