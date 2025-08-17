package Punto2;
/*
Clase CuentaSueldo (hereda de Cuenta):
Atributos propios:
- legajo (int): número identificatorio del empleado.
- institucion (String): nombre de la institución donde se deposita el sueldo.
- beneficios (String): descripción de beneficios asociados a la cuenta.
- cbu (long): número de CBU de 18 dígitos.
- tope (double): límite máximo permitido para extracción.
Métodos requeridos:
1) Constructores:
   - Constructor por defecto.
   - Constructor con CBU (18 dígitos) y tope fijado en 15.000.
2) Sobrescribir:
   - retirar(double monto):
     * Permitir retirar dinero solo si hay saldo suficiente.
     * No permitir extracciones superiores al tope definido.
3) transferir(double monto, long cbu):
   - Simular una transferencia a otra cuenta mediante un CBU.
   - Solo realizar si hay saldo suficiente.
   - Descontar el monto del saldo.
   - Mostrar el saldo final.
4) Sobrecargar:
   - transferir(double monto, String alias):
     * Simular una transferencia a un alias alfanumérico como destino.
*/

public class CuentaSueldo extends CuentaBancaria {

    //Atributos de clase
    private int legajo;
    private String institucion;
    private String beneficios;
    private long cbu;
    private double tope;
    private String alias;

    //Constructor por defecto
    public CuentaSueldo() {
    }

    //constructor con parametros
    public CuentaSueldo(String cbu) {
        if(cbu.length() == 18 && cbu.matches(("[0-9]+"))) {
            this.cbu = Long.parseLong(cbu);
        }else {
            System.out.println("El cbu debe ser 18 digitos y deben ser digitos");
        }
        this.tope = 15000;
    }

    @Override
    public void retirar(double cantidad){
        this.validar(cantidad, "ingreso", true);
        this.saldoActual -= cantidad;
    }

    public void transferir(double monto, long cbu){
        this.validar(monto, "monto", true);
        this.saldoActual -= monto;

        System.out.println("Transferencia exitosa a " + cbu);
        System.out.println("Saldo actual: " + this.saldoActual);
    }

    public void transferir(double monto, String alias){
       this.validar(monto, "monto", true);

       if(alias.contains(" ")){
           System.out.println("EL alias no debe tener espacios");
       }else {
           System.out.println("Transferencia exitosa a " + alias);
           System.out.println("Saldo actual: " + this.saldoActual);
       }
    }
}
