package modelo;

public class Impreso extends Libro{

    @Override
    public double calcularPrecioFijo() {
        return 0;
    }

    @Override
    public double calcularPrecioEnvio() {
        return 0;
    }

    @Override
    public double calcularPrecioFinal() {
        return 0;
    }
}
