package Metodos.Ex5;

public class Telefone {

    boolean ligada = false;

    void ligar(){
        if(ligada){
            System.out.println("Você já esta em uma ligação");
        }else{
            ligada = true;
            System.out.println("Ligação Iniciada");
        }
    }

    void desligar(){
        if(ligada){
            System.out.println("Ligação encerrada com sucesso");
            ligada = false;
        }else{
            System.out.println("Você não pode desligar por que não está em uma ligação");
        }

    }
}
