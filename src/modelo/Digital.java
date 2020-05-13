package modelo;

public class Digital extends Libro{

    public double calcularPrecioFinal(double costoComision){
        return 0;
    }

    @Override
    public double calcularPrecioFinal() {
        return 2;
    }
}
