package controlador;

import modelo.Cliente;
import modelo.Credito;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 */

@WebServlet("/ServletIniciarSesion")
public class ServletIniciarSesion extends HttpServlet {
    private HttpServletRequest request;
    private HttpServletResponse response;

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

    private void iniciarSesion(HttpSession session) throws IOException {
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

    private void redirectMain(Cliente cliente, HttpSession session) throws IOException {
       // session.setAttribute("client", cliente);
        System.out.println("HOLA!");
        response.sendRedirect("/PaginaPricipal.jsp"); // <------------------------- CAMBIAR EL NOMBRE DE ESTA PAGINA

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
