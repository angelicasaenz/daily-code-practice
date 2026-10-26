import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Logger logger = Logger.getLogger("ServicioPedidosLogger");
    public static void main(String[] args) {

        try {
            // Desactivar logs en consola
            logger.setUseParentHandlers(false);

            // Handler 1: Operaciones Generales (INFO, WARNING, SEVERE)
            FileHandler handlerInfo = new FileHandler("operaciones.log", true);
            handlerInfo.setFormatter(new SimpleFormatter());
            handlerInfo.setLevel(Level.INFO);

            // Handler 2: Solo Errores y Advertencias (WARNING, SEVERE)
            FileHandler handlerErrores = new FileHandler("errores.log", true);
            handlerErrores.setFormatter(new SimpleFormatter());
            handlerErrores.setLevel(Level.WARNING);

            // Asociar handlers
            logger.addHandler(handlerInfo);
            logger.addHandler(handlerErrores);

            ServicioPedidos servicio = new ServicioPedidos();

            logger.info("--- Inicio de procesamiento de pedidos ---");

            // Caso 1: Pedido Exitoso -> Va a operaciones.log
            try {
                servicio.procesarPedido("Teclado", 2, 10);
            } catch (StockInsuficienteException e) {
                logger.severe("Error inesperado en pedido exitoso: " + e.getMessage());
            }

            // Caso 2: Stock Insuficiente -> Genera WARNING/SEVERE y va a ambos logs
            try {
                servicio.procesarPedido("Mouse Gamer", 15, 5);
            } catch (StockInsuficienteException e) {
                // Registrar el fallo de la operación
                logger.severe("Fallo al procesar pedido por falta de stock: " + e.getMessage());
            }

            // Caso 3: Cantidad inválida (IllegalArgumentException) -> Va a ambos logs
            try {
                servicio.procesarPedido("Monitor", -3, 10);
            } catch (IllegalArgumentException e) {
                logger.severe("Fallo al procesar pedido por cantidad invalida: " + e.getMessage());
            } catch (StockInsuficienteException e) {
                logger.severe("Fallo inesperado: " + e.getMessage());
            }

            logger.info("--- Fin de procesamiento de pedidos ---");

            // Cerrar recursos
            handlerInfo.close();
            handlerErrores.close();

        } catch (IOException e) {
            System.err.println("Error al configurar los archivos de log: " + e.getMessage());
        }
    }
}