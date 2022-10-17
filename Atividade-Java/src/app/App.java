package app;
import Cliente.Cliente;
public class App {
    public static void main(String[] args) throws Exception {
       
       Cliente c = new Cliente();
       
        c.setAnoNascimento(1942);
        c.setLimiteDeCredito(1000);
       
        System.out.println(c.liberarCredito(99));
        System.out.println(c.restringirIdade(2022, 1)); 

    }
}
