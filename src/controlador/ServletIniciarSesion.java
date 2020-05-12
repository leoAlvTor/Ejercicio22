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

@WebServlet(name = "ServletIniciarSesion")
public class ServletIniciarSesion extends HttpServlet {
    private HttpServletRequest request;
    private HttpServletResponse response;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.request = request;
        this.response = response;
        iniciarSesion();
    }

    private void iniciarSesion() throws IOException {
        Cliente cliente = new Cliente(0, "example1@example.com", "pass", null, null);
        Cliente cliente1 = new Cliente(1, "example2@example.com", "pass", null, null);

        switch (String.valueOf(request.getAttribute("usuario"))){
            case "example1@example.com":
                redirectMain(cliente);
                break;
            case "example2@example.com":
                redirectMain(cliente1);
                break;
        }
    }


    private void redirectMain(Cliente cliente) throws IOException {
        cliente.setCredito(new Credito(100,0));
        HttpSession session = request.getSession(true);
        session.setAttribute("client", cliente);
        response.sendRedirect("/PaginaPricipal.jsp"); // <------------------------- CAMBIAR EL NOMBRE DE ESTA PAGINA

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
