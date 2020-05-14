package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String tipo = request.getParameter("tipo");
		String titulo= request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String edicion= request.getParameter("edicion");
		Double precio = Double.parseDouble(request.getParameter("precio"));
		Libro libro;
		Double preciofinal;
		switch (tipo) {
		case "impreso":
			System.out.println("es impreso");

			libro= new Impreso(titulo,autor,edicion,precio);
			libro.toString();
			preciofinal=libro.calcularPrecio();
			System.out.println("precio final impreso"+	preciofinal);
			break;
		case "digital":
			System.out.println("es digital");
			libro = new Digital(titulo,autor,edicion,precio);
			libro.toString();
			preciofinal=libro.calcularPrecio();
			System.out.println("precio final digital "+	preciofinal);
			break;

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

}
