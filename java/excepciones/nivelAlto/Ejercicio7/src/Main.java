//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CuentaBancaria c1 = new CuentaBancaria(12000);

        try{
            c1.retirar(12000);
        } catch(SaldoInsuficienteException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}