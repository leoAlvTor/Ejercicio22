package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Cliente;
import modelo.Digital;
import modelo.Libro;

/**
 * Servlet implementation class ServletVenta
 */
@WebServlet("/ServletVenta")
public class ServletVenta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVenta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url=null;
		String autor=request.getParameter("autor");
		System.out.println(autor);
		String titulo= request.getParameter("titulo");
		String edicion = request.getParameter("edicion");
		Double precio = Double.parseDouble(request.getParameter("precio"));
		Digital libro = new Digital(titulo, autor, edicion, precio);
		System.out.println("respuesta del servlet venta "+autor+titulo);
		
		try {
			request.setAttribute("libro", libro);

			
			url="/JSPs/compra.jsp";
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al redirigir");
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
		//---------------------
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
