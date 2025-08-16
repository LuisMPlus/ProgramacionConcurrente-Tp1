package Punto1;

public class Main {
    public static void main(String args[]){
        //Instanciación de objetos
        CuentaBancaria cb1 = new CuentaBancaria(42266094, 2020120, 5.3f);
        CuentaBancaria cb2 = new CuentaBancaria(18345097, 2000119, 3.4f);

        //Mostrar datos de cuenta
        cb1.mostrarDatosDeCuenta();
        cb2.mostrarDatosDeCuenta();

        //Actualización de saldo
        cb1.actualizarSaldo();
        cb2.actualizarSaldo();

        //Mostrar datos de cuenta actualizados
        cb1.mostrarDatosDeCuenta();
        cb2.mostrarDatosDeCuenta();

        //Ingresar dinero a las cuentas
        cb1.ingresar(120000);
        cb2.ingresar(120000);

        //Mostrar datos de cuenta actualizados
        cb1.mostrarDatosDeCuenta();
        cb2.mostrarDatosDeCuenta();

        //Retirar dinero de las cuentas
        cb1.retirar(120000);
        cb2.retirar(120000);

        //Mostrar datos de cuenta actualizados
        cb1.mostrarDatosDeCuenta();
        cb2.mostrarDatosDeCuenta();
    }
}
