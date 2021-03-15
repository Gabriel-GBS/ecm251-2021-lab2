package gomes.gabriel;

public class Conta {
    //1.Atributos
    Cliente cliente;
    int numero;
    double saldo;

    //2.Métodos
    void vizualizarSaldo(){
        double saldo = 50;
        System.out.println("Valor do saldo: R$" + this.saldo);
        //this = pega o valor da instancia
    }

    boolean sacar(double valor){
        if(this.saldo >= valor){
        this.saldo -= valor;
        return true;
        }
        return false;
    }

    void depositar(double valor){
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    }

    boolean transferirDinheiro(Conta destino, double valor){
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
