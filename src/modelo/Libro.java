package modelo;

public abstract class Libro {
	
	private String titulo, autor, edicion;
    private double precio,preciofinal;
    
	public Libro(String titulo, String autor, String edicion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.precio = precio;
    }
	
	public double calcularPrecio() {
		preciofinal= precio+(precio*calcularComision())+calcularEnvio();
		System.out.println("precio del libro"+ precio);
		return preciofinal;
		
	}
	
	public abstract double calcularComision();
	
	public abstract double calcularEnvio();

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

	public double getPreciofinal() {
		return preciofinal;
	}

	public void setPreciofinal(double preciofinal) {
		this.preciofinal = preciofinal;
	}
	

   
}
