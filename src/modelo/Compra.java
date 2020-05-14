package modelo;

import java.util.List;

public class Compra {
	
	 private List<Libro> libroList;

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
}
