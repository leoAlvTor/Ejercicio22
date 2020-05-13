package modelo;

public abstract class Libro {
    private String titulo, autor, edicion;
    private double precio;

    public Libro() {}

    public Libro(String titulo, String autor, String edicion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", edicion='" + edicion + '\'' +
                ", precio=" + precio +
                '}';
    }

    public abstract double calcularPrecioImpreso();
	public abstract double calcularPrecioDigital(double comision);

}
