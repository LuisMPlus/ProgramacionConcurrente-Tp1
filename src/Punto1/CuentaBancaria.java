package Punto1;

public class CuentaBancaria {

    //Atributos de clase
    private static int id = 100001;
    private long numeroCuenta;
    private long dni;
    private double saldoActual;
    private float interesAnual;

    //Constructor por defecto
    CuentaBancaria() {
    }

    //Constructor con parametros
    CuentaBancaria(long dni, double saldoActual, float interesAnual) {
        this.numeroCuenta = id;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
        ++id;
    }

    //Actualiza el saldo aplicando el interes diario (osea el interes anual)
    public void actualizarSaldo() {
        this.saldoActual += (this.saldoActual * this.interesAnual / 100);
        System.out.println("¡Saldo actualizado correctamente!");
    }

    //Actualiza el saldo agregando el ingreso por parametro
    public void ingresar(double ingreso){
        if(ingreso < 0){
            throw new RuntimeException("ingreso negativo");
        } else if( ingreso == 0){
            throw new RuntimeException("Sin ingreso");
        }
        this.saldoActual += ingreso;
        System.out.println("Se ha ingresado dinero correctamente");
    }

    public void retirar(double cantidad){
        if(cantidad < 0){
            throw new RuntimeException("ingreso negativo");
        } else if(cantidad == 0){
            throw new RuntimeException("Sin ingreso");
        }
        if(cantidad <= saldoActual){
            saldoActual -= cantidad;
        }else{
            throw new RuntimeException("Saldo Insuficiente");
        }
        System.out.println("Se ha retirado el dinero correctamente");
    }
    public void mostrarDatosDeCuenta(){
        System.out.println(
                "------------------\nNumero de Cuenta: "
                + numeroCuenta + "\nDni: "
                + dni + "\nSaldoActual: "
                + saldoActual + "\nIntereses aplicados anualmente: "
                + interesAnual + "\n------------------");
    }
}
