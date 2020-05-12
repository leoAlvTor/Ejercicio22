package modelo;

public class Digital extends Libro{

    public double calcularPrecioFinal(double costoComision){
        return this.getPrecio()+costoComision;
    }

    @Override
    public double calcularPrecioFinal() {
        return 2;
    }
}
