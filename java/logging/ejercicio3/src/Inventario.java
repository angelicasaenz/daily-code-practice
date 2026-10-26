import java.util.logging.Logger;

public class Inventario {

    private final Logger logger;

    public Inventario(Logger logger){
        this.logger = logger;
    }

    public void registrarEntrada (String producto){
        logger.info("Entrada de producto "+ producto);
    }

    public void registrarSalida(String producto){
        logger.info("Salida de producto: "+ producto);
    }

}
