import java.util.logging.Logger;

public class ServicioUsuarios {

    public static final Logger logger = Logger.getLogger(ServicioUsuarios.class.getName());

    public void validarCredenciales(String password, String user) throws AutenticacionException{

        if(!password.equals("1234") || !user.equals("admin")){
            logger.warning("Ingreso inválido.");
            throw new AutenticacionException("Credenciales inválidas");
        }

        logger.info("Ingreso exitoso!");


    }
}
