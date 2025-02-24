package Metodos;

public class Introducao {
    /*
    Métodos é uma função que programamos para a classe main. ele é o metodo principal

    Como criar um metodo?
    Indicador de acesso - public static
    Tipo de Retorno - void(nada)
    Nome - Main
    Conjunto de parametros desse metodo - String[] args
     */

    public static void main(String[] args) {

        //FAz a chamada do metodo e executa a instrução
        mensagem();

        //Faz a passagem dos intens para o metodo
        instrucoes("Estude e treine bastante");
        instrucoes("Assim voce aprende JAVA");

        //Faz a passagem de 4 notas e calcula a media
        //Aqui passamos os valores do tipo double
        media(10, 8.5, 9, 6.5);

        //Sobrecarga de metodos
        //Podemos criar mais de um metodo com o mesmo nome
        //Mas eles devem ter tipos diferentes para serem aceitos
        media(10, 8, 9, 6);

        int resultado;
        resultado= soma(50,97);

        System.out.println("Resultado da soma: " + resultado);

        //-----------------------------------------------------

        System.out.print("Resultado: " + somaNumeros(5, 10, 20, 55));
    }

    //Criamos uma lista de parametros do tipo inteiro
    public static int soma(int v1,int v2){

        int resultado = v1+v2;
        //return - Retorna o resultado da operação
        return resultado;
    }

    public static int somaNumeros(int...numeros){

        int resultado = 0;

        for ( int i=0; i<numeros.length; i++){
            resultado = resultado + numeros[i];
        }
        return resultado;
    }

    public static void media(double nota1,double nota2,double nota3,double nota4){
        double media;
        media = ((nota1+nota2+nota3+nota4) / 4);

        System.out.println("Media final com Double: " + media);
    }

    public static  void mensagem(){
        System.out.println(("Boa Noite, estou aprendendo sobre Metodos"));
    }
    //Nesse caso criamos o metodo com um parametro de entrada
    //String texto - recebe o texto que vem do metodo main e exibe na tela com o auxilio do SOP
    public static void instrucoes(String texto){
        System.out.println(texto);
    }

    public static void media(int n1,int n2,int n3,int n4){
        int media;
        media = ((n1+n2+n3+n4) / 4);

        System.out.println("Media final com Double: " + media);
    }



}
