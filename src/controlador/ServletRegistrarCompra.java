package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import modelo.Cliente;
import modelo.Compra;
import modelo.Digital;
import modelo.Impreso;
import modelo.Libro;

/**
 * Servlet implementation class ServletRegistrarCompra
 */
@WebServlet("/ServletRegistrarCompra")
public class ServletRegistrarCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistrarCompra() {
    
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session= request.getSession();
		String url=null;
		String tipo = request.getParameter("tipo");
		String titulo= request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String edicion= request.getParameter("edicion");
		Double precio = Double.parseDouble(request.getParameter("precio"));
		Compra compra = new Compra();
		List<Libro> listlibros= (List<Libro>) session.getAttribute("listlibros");
		List<Compra> compras = new ArrayList<Compra>();
		Libro libro=null;
		Double preciofinal;
		switch (tipo) {
		case "impreso":
			System.out.println("es impreso");
			libro= new Impreso(titulo,autor,edicion,precio);
			libro.toString();
			preciofinal=libro.calcularPrecio();
			libro.setPreciofinal(preciofinal);
			System.out.println("precio final impreso"+	preciofinal);
			listlibros.add(libro);
			
			
			break;
		case "digital":
			System.out.println("es digital");
			libro = new Digital(titulo,autor,edicion,precio);
			libro.toString();
			preciofinal=libro.calcularPrecio();
			System.out.println("precio final digital "+	preciofinal);
			libro.setPreciofinal(preciofinal);
			listlibros.add(libro);
			break;

		default:
			break;
		}
		
		session.setAttribute("listlibros", listlibros);
		
		System.out.println("---------termino----------");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

}
