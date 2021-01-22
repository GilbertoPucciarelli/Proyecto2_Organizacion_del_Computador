package Clases;

public class Pelicula {

    //VARIABLES
    private String titulo;
    private String genero;
    private String descripcion;
    private double precio;
    private int rating;
    private int stock;
    private int indice;

    //CONSTRUCTOR
    public Pelicula(String titulo, String genero, String descripcion, double precio, int rating, int stock, int indice) {
        this.titulo = titulo;
        this.genero = genero;
        this.descripcion = descripcion;
        this.precio = precio;
        this.rating = rating;
        this.stock = stock;
        this.indice = indice;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
