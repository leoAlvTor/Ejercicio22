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

@WebServlet("/ServletRegistro")
public class ServletRegistro extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Cliente cliente;

        String correo = request.getParameter("correo");
        String password = request.getParameter("password");
        System.out.println(correo);
        if(correo != null && password != null){
            cliente = new Cliente(1, correo, password, new Credito(100, 0),null);
            session.setAttribute("cliente", cliente);
            response.sendRedirect(request.getContextPath()+"/JSPs/logIn.html");
        }else{
            response.sendRedirect(request.getContextPath()+"/JSPs/registro.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
