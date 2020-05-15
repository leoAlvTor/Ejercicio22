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
import modelo.Credito;
import modelo.Libro;

/**
 * Servlet implementation class VisualizarCompras
 */
@WebServlet("/VisualizarCompras")
public class VisualizarCompras extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizarCompras() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session= request.getSession();
		
		Cliente cliente= (Cliente) session.getAttribute("cliente");
		List<Libro> listlibros= (List<Libro>) session.getAttribute("listlibros");

	    Compra compra=new Compra();
		List<Compra> compras=(List<Compra>) session.getAttribute("listcompras");
		
		
		compra.setLibroList(listlibros);
		compra.totalCompra();
		compras.add(compra);
		session.setAttribute("compra", compra);
		//AQUI METELE EL CREDITO NUEVO
		cliente.setCredito(new Credito());
		cliente.setCompras(compras);
		System.out.println("lineeeea "+cliente.toString());
		request.setAttribute("cliente",cliente);
		getServletContext().getRequestDispatcher("/listarCompras/listarCompras.jsp").forward(request, response);
		System.out.println("Nueva Compra");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
