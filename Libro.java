
public class Libro
{
    private String titulo;
    private String autor;
    
    public Libro(String tituloLibro, String autorLibro)
    {
        titulo = tituloLibro;
        autor = autorLibro;
    }
    
    //metodo de acceso
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
    
}