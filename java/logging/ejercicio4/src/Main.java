//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria(2000);

        try{
            FileHandler archivo = new FileHandler("app.log", true);
            archivo.setFormatter(new SimpleFormatter());
            logger.addHandler(archivo);

            c1.retirar(3000);
        } catch(SaldoInsuficienteException e){
            logger.severe("Error al retirar dinero: " + e.getMessage());
        }
        catch (IOException e) {
            logger.severe("Error al configurar archivo de logs");
            e.printStackTrace();
        }





    }
}