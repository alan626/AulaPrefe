

public abstract class Conta {
    
    private int numero;
    private float saldo;

    public void depositar(float valor){

        saldo += valor;
    }
    public void sacar(float valor){

        saldo -= valor;
    }
    public float getSaldo(){
        return saldo;
    }
    public abstract void imprimeSaldo();
}
