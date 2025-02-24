package Metodos.Ex5;

public class LigacaoTelefonica {
    public static void main(String[] args) {
        //Instanciando para ter acesso
        Telefone ligacao = new Telefone();

        ligacao.ligar();
        ligacao.ligar();
        ligacao.desligar();
        ligacao.desligar();
        ligacao.ligar();
        ligacao.desligar();
    }
}
