package Punto2;
/*
Clase CuentaBancaria:
Atributos:
- numeroCuenta (long): número de cuenta, asignado de forma correlativa a partir de 100001.
- dniCliente (long): DNI del cliente.
- saldoActual (double): saldo disponible en la cuenta.
- interesAnual (double): porcentaje de interés anual aplicado a la cuenta.
Métodos requeridos:
1) Constructores:
   - Constructor por defecto.
   - Constructor con parámetros: DNI, saldo e interés.
2) actualizarSaldo():
   - Actualiza el saldo aplicando el interés diario.
   - El interés diario se calcula como (interés anual / 365) y se aplica al saldo actual.
3) ingresar(double monto):
   - Permite ingresar una cantidad a la cuenta.
   - Suma el monto al saldo actual.
4) retirar(double monto):
   - Permite retirar una cantidad de la cuenta.
   - Solo se realiza si hay saldo suficiente.
5) mostrarDatos():
   - Muestra todos los datos de la cuenta (número, DNI, saldo, interés anual).
Nota:
- El número de cuenta se asigna de forma automática y correlativa.
- Comienza en 100001 y se incrementa en 1 por cada nueva cuenta creada.
*/

public class CuentaBancaria {

    //Atributos de clase
    private static int id = 100001;
    private long numeroCuenta;
    private long dni;
    protected double saldoActual;
    private float interesAnual;

    //Constructor por defecto
    CuentaBancaria() {

    }

    //Constructor con parametros
    CuentaBancaria(long dni, double saldoActual, float interes) {
        this.numeroCuenta = id;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interesAnual = interes;
        ++id;
    }

    //Actualiza el saldo aplicando el interes diario (osea el interes anual)
    public void actualizarSaldo() {
        this.saldoActual += (this.saldoActual * this.interesAnual / 100);
    }

    protected boolean validar(double cant, String nombre, boolean validarSaldo) {
        if(cant < 0)
            throw new RuntimeException("Error: El " + nombre + "no puede ser negativo");
        if(cant == 0)
            throw new RuntimeException("Error: El " + nombre + " no puede ser cero");

        if(validarSaldo && this.saldoActual < cant)
            throw new RuntimeException("Error: Saldo insuficiente");

        return true;
    }

    //Actualiza el saldo agregando el ingreso por parametro
    public void ingresar(double ingreso){
        this.validar(ingreso, "ingreso", false);
        this.saldoActual += ingreso;
    }

    public void retirar(double cantidad){
        this.validar(cantidad, "retirado", true);
        this.saldoActual -= cantidad;
    }

    public void mostrarDatosDeCuenta(){
        System.out.println("Numero de Cuenta: "
                + numeroCuenta + "\nDni: "
                + dni + "\nSaldoActual: "
                + saldoActual + "\nIntereses aplicados anualmente: "
                + interesAnual);
    }
}
