package gomes.gabriel;

public class Conta {
    //1.Atributos
    private Cliente cliente;
    private int numero;
    private double saldo;

    //2.Métodos
    public Conta(Cliente cliente, int numero, double saldo) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public boolean sacar(double valor){
        if(this.saldo >= valor){
        this.saldo -= valor;
        return true;
        }
        return false;
    }

    public void depositar(double valor){
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    public boolean transferirDinheiro(Conta destino, double valor){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + cliente +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
