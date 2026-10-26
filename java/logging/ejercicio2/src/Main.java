import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws Exception{

        Logger logger = Logger.getLogger(Main.class.getName());

        FileHandler archivo = new FileHandler("app.log", true);

        archivo.setFormatter(new SimpleFormatter());

        logger.addHandler(archivo);

        logger.setUseParentHandlers(false);
        logger.info("Proceso iniciado");


    }
}