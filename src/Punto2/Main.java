package Punto2;

public class Main {
    public static void main(String[] args) {
        //Instanciación de objetos
        CuentaSueldo cs1 = new CuentaSueldo(123456789, "profe.apruebenos.porfavor", 200000000, 123456789, 9.4f);
        CuentaSueldo cs2 = new CuentaSueldo(987654321, "no.sea.malo", 200000000, 987655432, 10.2f);

        //Retirar dinero de las cuentas
        cs1.retirar(120000);
        cs2.retirar(120000);

        //Mostrar datos de cuenta actualizados
        cs1.mostrarDatosDeCuenta();
        cs2.mostrarDatosDeCuenta();

        //Transferir por CBU
        cs1.transferir(120000, 123123131);
        cs2.transferir(120000, 123123124);

        //Mostrar datos de cuenta actualizados
        cs1.mostrarDatosDeCuenta();
        cs2.mostrarDatosDeCuenta();

        //Transferir por alias
        cs1.transferir(100000, "alias.prueba.alias");
        cs2.transferir(100000, "segundo.alias.dormir");
    }
}
