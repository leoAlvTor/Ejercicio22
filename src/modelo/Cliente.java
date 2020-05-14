package modelo;

import java.util.List;

public class Cliente {

	private Credito credito;
	private int id;
	public Cliente( int id, String correo, String contrasena ,List<Compra> compras,Credito credito) {
		super();
		this.credito = credito;
		this.id = id;
		this.correo = correo;
		this.contrasena = contrasena;
		this.compras = compras;
	}

	@Override
	public String toString() {
		return "Cliente [credito=" + credito + ", id=" + id + ", correo=" + correo + ", contrasena=" + contrasena
				+ ", compras=" + compras + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	private String correo;
	private String contrasena;
	
	private List<Compra> compras;

	public Credito getCredito() {
		return credito;
	}

	public void setCredito(Credito credito) {
		this.credito = credito;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
}
