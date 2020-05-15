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

/**
 * Servlet implementation class ServletRegistro
 */
@WebServlet("/ServletRegistro")
public class ServletRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 HttpSession session = request.getSession(true);
		 Cliente cliente;

		 String correo = request.getParameter("correo");
		 String password = request.getParameter("contrasena");

		 System.out.println(correo + password);
		 if(correo != null && password != null){
		 	cliente = new Cliente(1, correo, password, null,new Credito(100, 0));
		 	session.setAttribute("cliente", cliente);
			 System.out.println("REDIRECT <________________________");
		 	response.sendRedirect(request.getContextPath()+"/JSPs/logIn.html");
		 }else{
		 	System.out.println("Correo nulo!");
		 	response.sendRedirect(request.getContextPath()+"/JSPs/registro.jsp");
		 }

	}

}
