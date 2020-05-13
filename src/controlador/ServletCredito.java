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

@WebServlet(name = "ServletCredito")
public class ServletCredito extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Cliente obtenido desde el login a traves de la sesión.
        Cliente cliente = (Cliente) (request.getSession(false)).getAttribute("cliente");

        // Obtengo el objeto Credito de la variable cliente.
        Credito credito = cliente.getCredito();
        // Obtengo el atributo 'saldoActual' de la variable credito
        double saldoAnterior = cliente.getCredito().getSaldoActual();

        // Credito a cargar obtenido desde la pagina JSP
        double creditoParametro = Double.parseDouble(request.getParameter("credito"));
        // Actualizamos el saldo actual con el valor del parametro mas el saldo actual
        credito.setSaldoActual(creditoParametro + saldoAnterior);
        // Actualizamos el saldo anterior con el valor de la variable obtenida originalmente 'saldoActual'
        credito.setSaldoAnterior(saldoAnterior);
        // Se actualiza los datos del credito del cliente.
        cliente.setCredito(credito);

        // Elimino el atributo cliente
        request.getSession(false).removeAttribute("cliente");
        // Ingreso el atributo nuevamente con los datos actualizados.
        request.getSession(false).setAttribute("cliente", cliente);

        System.out.println("CREDITO ACTUALIZADO");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
