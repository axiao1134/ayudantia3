public class Libros {
    private String nombreLib;
    private String autor;
    private String editorial;

    public Libros(String nombreLib, String autor, String editorial){
        this.nombreLib=nombreLib;
        this.autor=autor;
        this.editorial=editorial;
    }
    public String getNombre() {
        return nombreLib;
    }

    public void setNombre(String nombre) {
        this.nombreLib = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

}
