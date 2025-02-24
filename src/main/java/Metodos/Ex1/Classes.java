package Metodos.Ex1;
/*
Tudo em Java é uma classe
Classe são um conjunto de regras que um valor/objeto/imagem/video vai seguir
Quando instanciamos dentro de outros programas vamos usar esse conjunto de regras para
tratar alguma coisa (API)

Dentro da classe temos:
Metodos - São as funcionalidades
Atributos - Caracteristicas (variaveis)
*/
public class Classes {
    public static void main(String[] args) {
        Escola aluno1 = new Escola(1);
        Escola aluno2 = new Escola(2);
        Escola aluno3 = new Escola(3);
        Escola aluno4 = new Escola(4);
        Escola aluno5 = new Escola(5);

        aluno1.imprimirNumeros(5, 10);
    }
}
