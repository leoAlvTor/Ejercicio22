package modelo;

public class Credito {
    double saldoActual;
    double saldoAnterior;

    public Credito() {
    }

    public Credito(double saldoActual, double saldoAnterior) {
        this.saldoActual = saldoActual;
        this.saldoAnterior = saldoAnterior;
    }


    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    @Override
    public String toString() {
        return "Credito{" +
                "saldoActual=" + saldoActual +
                ", saldoAnterior=" + saldoAnterior +
                '}';
    }
}
