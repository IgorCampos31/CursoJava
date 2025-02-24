package Metodos.Ex6;

public class Atributos_Statics {
    public static void main(String[] args) {

        /*
        Quando crio um elemento e defino para Static eu posso instanciar vários objetos dessa classe,
        Mas todos que eu instanciar vão apontar para o mesmo endereço da memória, é como se eu tivesse
        várias variaveis e quando eu altero o valor de uma, todas as variaveis que estao usando receberão o mesmo valor
         */

        Pao pao1 = new Pao("Francês" , 20, "Pequeno");
        Pao pao2 = new Pao("Pao de Leite" , 50, "Medio");
        Pao pao3 = new Pao("Baguette" , 35, "Grande");

        Pao.quantidadePao=300;

        System.out.println("------------------\n\n");
        pao1.imprimir();
        pao2.imprimir();
        pao3.imprimir();


    }
}
