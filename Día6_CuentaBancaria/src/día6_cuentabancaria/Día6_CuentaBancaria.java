package día6_cuentabancaria;

public class Día6_CuentaBancaria {

    public static void main(String[] args) {
              // Crear cuenta bancaria con saldo inicial en 0
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Pérez", 123456789, TipoCuenta.CUENTA_DE_AHORROS);
        
        // Mostrar información inicial
        cuenta.imprimir();

        // Realizar consignaciones y retiros
        cuenta.actualizarSaldo(200000);
        cuenta.actualizarSaldo(300000);
        cuenta.retirar(400000);

        // Mostrar saldo final
        cuenta.consultarSaldo();

    }

}
