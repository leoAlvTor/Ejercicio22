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

import modelo.Compra;
import modelo.Libro;

/**
 * Servlet implementation class NuevaCompra
 */
@WebServlet("/NuevaCompra")
public class NuevaCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NuevaCompra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("llamo akiiiii");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session= request.getSession();
		
		Compra compra= (Compra) request.getAttribute("compra");

		List<Compra> listcompras = (List<Compra>) session.getAttribute("listcompras");
		listcompras.add(compra);

		session.setAttribute("listcompras",listcompras );
		List<Libro> listlibros = new ArrayList<Libro>();
		session.setAttribute("listlibros", listlibros);
		compra= null;
		session.setAttribute("compra", compra);
		System.out.println("Acaba de finalizar su compra");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
