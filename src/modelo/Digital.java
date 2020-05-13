package modelo;

public class Digital extends Libro{

	@Override
	public double calcularPrecioFijo() {
		return getPrecio();
	}

	@Override
	public double calcularPrecioEnvio() {
		// TODO Auto-generated method stub
		return 1;
	}

//	@Override
//	public double calcularPrecioImpreso() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public double calcularPrecioDigital(double comision) {
//		// TODO Auto-generated method stub
//		return getPrecio()+comision;
//	}
//

}
