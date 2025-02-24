package Metodos.Ex4;

public class Conta {
    //Atributos
    public String nome;
    public double saldo;

    void sacar(double valor){
        //Apontar para o atributo da classe
        this.saldo = saldo - valor;
    }

    void depositar (double valor){
        this.saldo = saldo + valor;
    }

}
