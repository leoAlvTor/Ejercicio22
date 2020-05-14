package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Cliente;
import modelo.Compra;
import modelo.Digital;
import modelo.Impreso;
import modelo.Libro;

/**
 * Servlet implementation class visualizarCompras
 */
@WebServlet("/visualizarCompras")
public class visualizarCompras extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public visualizarCompras() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		Cliente cliente=new Cliente();
		
		Compra compra=new Compra();
		Compra compra1=new Compra();
		
		List<Libro> libros=new ArrayList<Libro>();
		List<Libro> libros1=new ArrayList<Libro>();
		
		List<Compra> compras=new ArrayList<Compra>();
		
		 
		Libro l1=new Digital();
		
		l1.setAutor("uno");
		l1.setEdicion("uno");
		l1.setPrecio(4.5);
		l1.calcularPrecioFinal();
		
		Libro l2=new Digital();
		
		l2.setAutor("dos");
		l2.setEdicion("dos");
		l2.setPrecio(34.5);
		l2.calcularPrecioFinal();
		
		libros.add(l1);
		libros.add(l2);	
		
		Libro l3=new Digital();
		l3.setAutor("tres");
		l3.setEdicion("tres");
		l3.setPrecio(29.5);
		l3.calcularPrecioFinal();
		
		
		Libro l4=new Impreso();
		l4.setAutor("cuatro");
		l4.setEdicion("cuatro");
		l4.setPrecio(29.5);
		l4.calcularPrecioFinal();
		
		libros1.add(l3);
		libros1.add(l4);
		
		compra.setLibroList(libros);
		compra.totalCompra();
		compra1.setLibroList(libros1);
		compra1.totalCompra();
		
		
		compras.add(compra);
		compras.add(compra1);
		
		cliente.setCorreo("pedro@illaisaca");
		cliente.setCompraslList(compras);
		
		
		request.setAttribute("cliente",cliente);
		getServletContext().getRequestDispatcher("/listarCompras/listarCompras.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
