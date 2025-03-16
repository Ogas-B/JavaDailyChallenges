package día6_cuentabancaria;

enum TipoCuenta {
    CUENTA_DE_AHORROS, CUENTA_CORRIENTE
}

public class CuentaBancaria {
    private String nombreTitular;
    private String apellidoTitular;
    private int numeroCuentaBancaria;
    private TipoCuenta tipoCuenta;
    private double saldoCuenta;

    // Constructor sin saldo inicial (inicia en 0)
    public CuentaBancaria(String nombreTitular, String apellidoTitular, int numeroCuentaBancaria, TipoCuenta tipoCuenta) {
        this.nombreTitular = nombreTitular;
        this.apellidoTitular = apellidoTitular;
        this.numeroCuentaBancaria = numeroCuentaBancaria;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = 0; // Saldo inicial en 0
    }

    // Método para imprimir la información de la cuenta
    public void imprimir() {
        System.out.println("📌 Datos de la Cuenta Bancaria:");
        System.out.println("Titular: " + nombreTitular + " " + apellidoTitular);
        System.out.println("Número de cuenta: " + numeroCuentaBancaria);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: $" + saldoCuenta);
        System.out.println("----------------------------");
    }

    // Método para consultar el saldo
    public void consultarSaldo() {
        System.out.println("🔹 Su saldo actual es: $" + saldoCuenta);
    }

    // Método para consignar dinero
    public void actualizarSaldo(double monto) {
        if (monto > 0) {
            saldoCuenta += monto;
            System.out.println("✅ Consignación de $" + monto + " realizada. Nuevo saldo: $" + saldoCuenta);
        } else {
            System.out.println("⚠️ El monto debe ser mayor a 0.");
        }
    }

    // Método para retirar dinero
    public void retirar(double montoRetirar) {
        if (montoRetirar > 0) {
            if (montoRetirar <= saldoCuenta) {
                saldoCuenta -= montoRetirar;
                System.out.println("💰 Retiro de $" + montoRetirar + " exitoso. Saldo actual: $" + saldoCuenta);
            } else {
                System.out.println("❌ Fondos insuficientes. No puede retirar más de $" + saldoCuenta);
            }
        } else {
            System.out.println("⚠️ El monto a retirar debe ser mayor a 0.");
        }
    }
}
