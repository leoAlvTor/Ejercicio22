package pruebas;

import modelo.Digital;
import modelo.Impreso;
import modelo.Libro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Libro l1 = new Digital();
		l1.setAutor("rjy");
		l1.setEdicion("fasdf");
		l1.setPrecio(4.5);
		System.out.println(l1.calcularPrecioFinal());
		
		Libro l2=new Digital();
		l2.setAutor("nfgh");
		l2.setEdicion("cr");
		l2.setPrecio(34.5);
		System.out.println(l2.calcularPrecioFinal());
		
		Libro l3=new Digital();
		l3.setAutor(" erf");
		l3.setEdicion(" er");
		l3.setPrecio(29.5);
		System.out.println(l3.calcularPrecioFinal());
		
		
		Libro l4=new Impreso();
		l4.setAutor(" erf");
		l4.setEdicion(" er");
		l4.setPrecio(29.5);
		System.out.println(l4.calcularPrecioFinal());

	}

}
