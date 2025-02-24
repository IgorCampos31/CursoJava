package Metodos.Ex1;

//Classe
//public - Modificador de acesso - public/ privat/ protect
//class - identifica para o java que é uma classe
//Nome - Escola

public class Escola {
    /*
    Dentro da classe eu posso criar quantos objetos  / atributos eu quiser

    Exemplo:
    -Posso criar outras escolas com oibjetos e cada objeto será um objeto separado possuindo suas
    proprias caracteristicas só todos vao seguir as regras da classe


     */
    public Escola (int aluno){
        System.out.println("Aluno: " + aluno);

    }

    public void imprimirNumeros (int valorInicio, int valorFinal){
        for(int i = valorInicio;i<=10; i++){
            System.out.println("Numero: " + i);

        }


    }
}
