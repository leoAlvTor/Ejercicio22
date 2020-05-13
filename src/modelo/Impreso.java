package modelo;

public class Impreso extends Libro{

	@Override
	public double calcularPrecioImpreso() {
		// 
		/**
		 * El precio del libro impreso se suma el 2% por 
		 * comision y mas 20 proprecio de envio  
		 */
		return getPrecio()+(getPrecio()*0.2)+20;
	}

	@Override
	public double calcularPrecioDigital(double comision) {
		// TODO Auto-generated method stub
		return 0;
	}

}
