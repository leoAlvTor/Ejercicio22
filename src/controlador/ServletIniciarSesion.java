package controlador;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Cliente;
import modelo.Compra;
import modelo.Digital;
import modelo.Impreso;
import modelo.Libro;


/**
 * Servlet implementation class ServletIniciarSesion
 */
@WebServlet("/ServletIniciarSesion")
public class ServletIniciarSesion extends HttpServlet {

    private HttpServletRequest request;
    private HttpServletResponse response;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletIniciarSesion() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.request = request;
        this.response = response;
        HttpSession session = request.getSession(false);
        System.out.println(session);
        if(session == null){
            response.sendRedirect(request.getContextPath()+"/JSPs/registro.jsp");
        }else {
            iniciarSesion(session);
        }
    }

    private void iniciarSesion(HttpSession session) throws IOException, ServletException {
        String correo = request.getParameter("usuario");
        String password = request.getParameter("password");

        Cliente cliente = (Cliente) session.getAttribute("cliente");

        if(cliente != null){
            System.out.println(cliente.toString());
            System.out.println(correo + "\t" + password);
            if(cliente.getCorreo().equals(correo) && password.equals(password))
                redirectMain(cliente, session);
            else
                response.sendRedirect(request.getContextPath()+"/JSPs/registro.jsp");
        }else{
            response.sendRedirect(request.getContextPath()+"/JSPs/registro.jsp");
        }

    }

    private void redirectMain(Cliente cliente, HttpSession session) throws IOException, ServletException {
       // session.setAttribute("client", cliente);
    	String url=null;
        System.out.println("HOLA!");

        Libro l1= new Digital("El Senor de los Anillos","J.R.R. Tolkien","3era edicion",28.99);
		Libro l2= new Digital("El Codigo da Vinci","Dan Brown","3era edicion",25.99);
		Libro l3= new Digital("El Alquimista","Paulo Coelho","3era edicion",22.99);
		Libro l4= new Impreso("El Senor de los Anillos","J.R.R. Tolkien","3era edicion",23.99);
		Libro l5= new Impreso("El Codigo da Vinci","Dan Brown","3era edicion",22.99);
		Libro l6= new Impreso("El Alquimista","Paulo Coelho","3era edicion",22.99);
        List<Libro> listlibros= new ArrayList<Libro>();	
        List<Compra> listcompras = new ArrayList<Compra>();
		try {
			request.setAttribute("l1",l1);	
			request.setAttribute("l2",l2);
			request.setAttribute("l3",l3);
			request.setAttribute("l4",l4);
			request.setAttribute("l5",l5);
			request.setAttribute("l6",l6);
			request.setAttribute("cliente",cliente);
	        session.setAttribute("listlibros", listlibros);
	        session.setAttribute("listcompras", listcompras);
			
			url="/JSPs/Catalogo.jsp";
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error al redirigir");
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}