package controlador;

import modelo.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

    private void iniciarSesion(){
        Cliente cliente = new Cliente(0, "example1@example.com", "pass", null, null);
        Cliente cliente1 = new Cliente(1, "example2@example.com", "pass", null, null);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
