package modelo;

import java.util.List;

public class Cliente {
    private int id;
    private String correo, password;
    private Credito credito;
    private List<Compra> compraslList;

    public Cliente() {}

    public Cliente(int id, String correo, String password, Credito credito, List<Compra> compraslList) {
        this.id = id;
        this.correo = correo;
        this.password = password;
        this.credito = credito;
        this.compraslList = compraslList;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }

    public List<Compra> getCompraslList() {
        return compraslList;
    }

    public void setCompraslList(List<Compra> compraslList) {
        this.compraslList = compraslList;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", correo='" + correo + '\'' +
                ", password='" + password + '\'' +
                ", credito=" + credito +
                ", compraslList=" + compraslList +
                '}';
    }
}
