public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if(monto > saldo){
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
        saldo -= monto;
        System.out.println("Retiro exitoso!");
        System.out.println("Saldo nuevo: " + saldo);
    }
}
