
public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    private String detalles;
    private int prestamos;
    
    public Libro(String tituloLibro, String autorLibro, int paginasLibro)
    {
        titulo = tituloLibro;
        autor = autorLibro;
        paginas = paginasLibro;
        detalles = "";
        numeroDeReferencia = "";
        prestamos = 0;
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
    
    public int dimePaginas()
    {
        return paginas;
    }
    
    public String dimeDetalles()
    {
         if (numeroDeReferencia.length() > 0)
         {
             detalles ="Titulo " +titulo+ "," +"Autor: " +autor+ "," + "Páginas: "+paginas+ "Numero de Referencia: " +numeroDeReferencia+ "Prestamos: " +prestamos;
         }
         else
         {
             detalles ="Titulo " +titulo+ "," +"Autor: " +autor+ "," + "Páginas: "+paginas+ "Numero de Referencia: " +"ZZZ"+ "Prestamos: " +prestamos;;
         }
  
         return detalles;
    }
    
    public void cambiaNumRef(String nuevaRef)
    {
        if(nuevaRef.length() > 3)
        {
            numeroDeReferencia = nuevaRef;
        }
    }
    
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    
    public void prestar()
    {
        prestamos++;
    }
    
    public int dimePrestamos()
    {
        return prestamos;
    }
    
}