package gomes.gabriel;

public class Main {

    public static void main(String[] args) {
        //Cria uma referência para um objeto Conta
        Conta c1;
        //Instancia um objeto conta
        c1 = new Conta();
        c1.cliente = new Cliente();
        //Manipular os atributos
        c1.cliente.titular = "Murilo";
        c1.saldo = 199.99;
        c1.numero = 1234;

        //Invocar o método vizualizarSaldo()
        c1.vizualizarSaldo();

        Conta c2 = new Conta();
        c2.cliente = new Cliente();
        c2.saldo = 400;
        c2.cliente.titular = "GominDaZs";
        c2.vizualizarSaldo();

        c1.depositar(100);
        c1.vizualizarSaldo();

        if(c2.sacar(100)){
            System.out.println("Deu bom!");
        }else {
            System.out.println("Deu Ruim!");
        }
        c2.vizualizarSaldo();

        if(c1.transferirDinheiro(c2, 2000)){
            System.out.println("Transferencia realizada com sucesso!");
        } else{
            System.out.println("Ta pobre irmão!");
        }
        c1.vizualizarSaldo();
        c2.vizualizarSaldo();

        System.out.println("C1:" + c1.toString());
        System.out.println("C2:" + c2.toString());
    }
}
