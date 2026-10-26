import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{

            FileHandler archivo = new FileHandler("app.log", true);
            archivo.setFormatter(new SimpleFormatter());
            logger.addHandler(archivo);

            ServicioUsuarios s1 = new ServicioUsuarios();

            System.out.println("Ingrese su usuario: ");
            String user = sc.nextLine();

            System.out.println("Ingrese su contraseña: ");
            String password = sc.nextLine();

            s1.validarCredenciales(password, user);

        } catch(AutenticacionException e){

            logger.severe("Error de autenticación " + e.getMessage());
            System.out.println("Accceso denegado: " + e.getMessage());
        } catch(IOException e){
            logger.severe("Error al configurar archivo de logs");
            e.printStackTrace();
        }


    }
}