/**
 * clase Libro contiene la bibliografia de un libro tambien pudes ver los prestamos 
 * @author Israel Vergara
 */
public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;
    private String numeroDeReferencia;
    private String detalles;
    private int prestamos;
    
    /**
     * Constructor que inicializa las variables titulo, autor, paginas, 
     * detalles, numeroDeReferencia  y prestamos.
     * @param tituloLibro, autorLibro, paginasLibro las cuales contiene titulo 
     * del libro, autor del libro y numero de paginas respectivamente.
     */
    public Libro(String tituloLibro, String autorLibro, int paginasLibro)
    {
        titulo = tituloLibro;
        autor = autorLibro;
        paginas = paginasLibro;
        detalles = "";
        numeroDeReferencia = "";
        prestamos = 0;
    }
    
    /**
     * metodo que muestra el nombre del autor
     * @return autor variable que contiene el numero del autor
     */
    public String dimeAutor()
    {
        return autor;
    }
    
    /**
     * metodo que muestra el titulo del libro
     * @return titulo variable que contiene el titulo del libro
     */
    public String dimeTitulo()
    {
        return titulo;
    }
    
    /**
     * metodo que muestra el numero de paginas del libro
     * @return paginas variable que contiene el numero de paginas del libro.
     */
    public int dimePaginas()
    {
        return paginas;
    }
    
    /**
     * metodo que muestra los detalles del libro.
     * @return detalles variable que contiene los detalles del libro
     */
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
    
    /**
     * metodo que cambia el nuero de referencia.
     * @param nuevaRef contiene el valor que introduce el usuario
     */
    public void cambiaNumRef(String nuevaRef)
    {
        if(nuevaRef.length() > 3)
        {
            numeroDeReferencia = nuevaRef;
        }
    }
    
    /**
     * metodo que muestra el numero de referencia.
     * @return numeroDeReferencia variable que contiene elvalor de la referencia.
     */
    public String dimeNumRef()
    {
        return numeroDeReferencia;
    }
    
    /**
     * metodo que incrementa lso prestamos del libro
     */
    public void prestar()
    {
        prestamos++;
    }
    
    /**
     * metodo que muestra los prestamos del libro.
     * @return prestamos variable que tiene cuantas veces se ha prestado el libro.
     */
    public int dimePrestamos()
    {
        return prestamos;
    }
    
}