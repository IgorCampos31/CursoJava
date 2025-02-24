package Metodos.Ex4;

public class CaixaEletronico {
    public static void main(String[] args) {
        Conta operacao = new Conta();

        operacao.nome = "Roger";
        operacao.saldo=100.0;

        System.out.println("Cliente: " + operacao.nome);
        System.out.println("Saldo atual: " + operacao.saldo);
        System.out.println("\n------------------");

        //--------------------------------------------
        int valorDep = 200;
        operacao.depositar(valorDep);

        System.out.println("Você depositou: " + valorDep);

        System.out.println("Saldo atual: " + operacao.saldo);
        System.out.println("\n------------------");

        int valorSacar = 150;
        operacao.sacar(valorSacar);

        System.out.println("Você sacou: " + valorSacar);

        System.out.println("Saldo atual: " + operacao.saldo);
        System.out.println("\n------------------");


    }
}
