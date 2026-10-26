import java.util.logging.Logger;

public class CuentaBancaria {

    public static final Logger logger = Logger.getLogger(CuentaBancaria.class.getName());

    private double saldo;

    public CuentaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void retirar(double monto) throws SaldoInsuficienteException{

        if (monto > saldo){
            logger.warning("Intento de retiro superior al saldo");
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        logger.info("Retiro realizado exitosamente.");


    }
}
