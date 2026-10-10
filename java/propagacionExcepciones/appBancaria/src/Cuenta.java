public class Cuenta {

    private String numeroCuenta;
    private double saldo;
    private String clave;

    public Cuenta(String numeroCuenta, double saldo, String clave){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.clave = clave;
    }

    public String getNumeroCuenta(){
        return numeroCuenta;
    }

    public double getSaldo(){
        return saldo;
    }
    public String getClave(){
        return clave;
    }

    // Depósito lanzando excepción MontoInvalidoException

    public void depositar(double monto) throws MontoInvalidoException {

        if(monto <=0){
            throw new MontoInvalidoException("Monto inválido.");
        }
        saldo += monto;
    }

    // Retirar

    public void retirar(double monto) throws MontoInvalidoException, SaldoInsuficienteException{
        if(monto <=0){
            throw new MontoInvalidoException("Monto inválido.");
        }
        if(monto > saldo){
            throw new SaldoInsuficienteException("Fondos insuficientes.");
        }
        saldo -= monto;
    }

    // Transferir

    public void transferir(Cuenta destino, double monto)throws MontoInvalidoException, SaldoInsuficienteException{
        if(monto <=0){
            throw new MontoInvalidoException("Monto inválido.");
        }
        if(monto > saldo){
            throw new SaldoInsuficienteException("Fondos insuficientes para realizar la transferencia.");
        }
        this.retirar(monto);
        destino.depositar(monto);
    }

}
