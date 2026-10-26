import java.util.logging.Logger;

public class ServicioPedidos {

    private static final Logger logger = Logger.getLogger(ServicioPedidos.class.getName());

    public void procesarPedido(String producto, int cantidadRequerida, int stockDisponible) throws StockInsuficienteException {

        // 1. Validar escenario critico (SEVERE) -> Va a errores.log
        if (cantidadRequerida <= 0) {
            logger.severe("Error critico: La cantidad solicitada debe ser mayor a cero (" + cantidadRequerida + ")");
            throw new IllegalArgumentException("Cantidad no valida");
        }

        // 2. Validar advertencia de negocio (WARNING) -> Va a errores.log
        if (cantidadRequerida > stockDisponible) {
            logger.warning("Intento de pedido superior al stock. Solicitado: " + cantidadRequerida + ", Disponible: " + stockDisponible);
            throw new StockInsuficienteException("No hay suficiente stock para " + producto);
        }

        // 3. Operación exitosa (INFO) -> Va a operaciones.log y a errores.log (por jerarquia de niveles)
        logger.info("Pedido procesado exitosamente: " + cantidadRequerida + " unidades de " + producto);
    }
}
