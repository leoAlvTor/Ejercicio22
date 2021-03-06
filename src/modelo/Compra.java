package modelo;

import java.io.Serializable;
import java.util.List;

public class Compra implements Serializable{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Libro> libroList;
	    private double total;
	    
	    

	    public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public List<Libro> getLibroList() {
	        return libroList;
	    }

	    public void setLibroList(List<Libro> libroList) {
	        this.libroList = libroList;
	    }

	    @Override
	    public String toString() {
	        return "Compra{" +
	                "libroList=" + libroList +
	                '}';
	    }
	    
	    public double totalCompra() {
	    	
	    	 
	    	for (Libro libro : libroList) {
				total+=libro.calcularPrecio();
			}
	    	return total;
	    }
}
