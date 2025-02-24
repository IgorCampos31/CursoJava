package Metodos.Ex2;

import java.util.Scanner;

public class Curso {
    public static void main(String[] args) {
        //Preenchendo os valores e imprimindo
        Materias aluno1 = new Materias("Python", 120, 59);
        Materias aluno2 = new Materias("Java", 80, 109);

        aluno1.nomeMateria = "Algebra";
        aluno1.quantidadeAlunos =40;

        System.out.println(aluno1.nomeMateria);
        System.out.println(aluno1.quantidadeAlunos);
        //----------------------------------------------------------------------------
        Scanner objetoNome = new Scanner(System.in);

        int qtdHoras, qtdAlunos, contador;
        contador=0;
        for(int i =0; i<=3; i++){
            contador = contador +1;
            System.out.println("Digite a carga horaria do curso" + contador);
            qtdHoras = objetoNome.nextInt();

            System.out.println("Digite a quantidade de alunos do curso" + contador);
            qtdAlunos = objetoNome.nextInt();

            aluno1.soma(i, qtdHoras, qtdAlunos);

        }

    }
}
