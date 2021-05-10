

public class Main {
    

    public static void main(String[] args) {
         
    ContaCorrente c = new ContaCorrente();
    c.depositar(50);
    c.depositar(28);
    c.sacar(10);
    c.imprimeSaldo();

    ContaPoupanca cp = new ContaPoupanca();
    cp.depositar(100);
    cp.sacar(40);
    cp.imprimeSaldo();

    }
    

}
