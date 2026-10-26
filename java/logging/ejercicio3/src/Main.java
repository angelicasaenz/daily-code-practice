import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            // 1. Obtener el logger
            Logger logger = Logger.getLogger(Main.class.getName());

            // 2. Crear el FileHandler en modo append (true)
            FileHandler archivo = new FileHandler("inventario.log", true);

            // 3. Asignar tu formateador personalizado
            archivo.setFormatter(new MiFormato());

            // 4. Evitar duplicación de mensajes en la consola
            logger.setUseParentHandlers(false);

            // 5. Vincular el handler al logger
            logger.addHandler(archivo);

            // --- INICIO DEL FLUJO DE REGISTRO ---

            // Inicio del sistema
            logger.info("Inicio del sistema");

            // Instanciamos el inventario pasando el logger configurado
            Inventario inventario = new Inventario(logger);

            // Simulación de movimientos
            inventario.registrarEntrada("Teclado Mecánico");
            inventario.registrarSalida("Mouse Gamer");

            // Cierre del sistema
            logger.info("Cierre del sistema");

            // Opcional: cerrar el handler al finalizar
            archivo.close();

        } catch (SecurityException | IOException e) {
            System.err.println("Error al configurar el sistema de logs: " + e.getMessage());
        }
    }
}