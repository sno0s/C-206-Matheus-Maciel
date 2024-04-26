public class Conta {
    private int numero;
    private float saldo;
    private float limite;

    public void sacar(float quantidade){
        if(this.saldo>quantidade)
            saldo -= quantidade;
    }

    public void depositar(float quantidade){
        saldo += quantidade;

    }

    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }
}
