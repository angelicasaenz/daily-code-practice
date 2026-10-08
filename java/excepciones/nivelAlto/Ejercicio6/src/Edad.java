public class Edad {

    private int edad;

    public Edad(int edad){
        this.edad = edad;
    }

    public void validarEdad() throws EdadInvalidaException{
        if(this.edad < 18){
            throw new EdadInvalidaException("Usted es menor de edad.");
        }

    }
}
