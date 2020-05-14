package modelo;

public class Impreso extends Libro {

	public Impreso(String titulo, String autor, String edicion, double precio) {
		super(titulo, autor, edicion, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularComision() {
		// TODO Auto-generated method stub
		return 0.2;
	}

	@Override
	public double calcularEnvio() {
		// TODO Auto-generated method stub
		return 20;
	}


	
	

}
