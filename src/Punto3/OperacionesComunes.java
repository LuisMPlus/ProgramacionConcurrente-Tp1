package Punto3;

public interface OperacionesComunes {
    int MAX_ALIAS = 20;
    double MAX_TRANSFERENCIA = 100000;
    float INTERES_PLAZO_FIJO = 15;

    public void pagarServicio(double monto, String servicio);
    public void cambiarAlias(String alias);
}
