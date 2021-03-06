package gomes.gabriel;

import java.util.Scanner;

public class Sistema {
    private boolean executarSistema;
    private Scanner scanner;

    public void executar(){
        int opcao;
        while(executarSistema){
            exibirMenu();
            opcao = scanner.nextInt();
            avaliarOpcao(opcao);

        }
    }

    private void avaliarOpcao(int opcao) {
        switch (opcao){
            case 0:
                System.out.println("Obrigado por utilizar o sistema");
                this.executarSistema = false;
                break;
            default:
                System.out.println("Opção ainda não implementada");
                break;

        }
    }

    public Sistema() {
        this.executarSistema = true;
        this.scanner = new Scanner(System.in);  // Cria um scanner para o teclado (entrada padrão)

    }


    private void exibirMenu(){
        System.out.println("Bem vindo ao MauaBanck");
        System.out.println("1 - Visualizar Saldo");
        System.out.println("2 - Depositar Dinheiro");
        System.out.println("3 - Sacar Dinheiro");
        System.out.println("4 - Transferir Dinheiro");
        System.out.println("5 - Pagar conta (título)");
        System.out.println("0 - Encerrar sistema");

    }
}
