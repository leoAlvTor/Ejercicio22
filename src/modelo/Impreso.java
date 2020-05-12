package modelo;

public class Impreso extends Libro{

    @Override
    public double calcularPrecioFinal() {
        return (this.getPrecio() + (this.getPrecio()*00.2) + 20);
    }
}
