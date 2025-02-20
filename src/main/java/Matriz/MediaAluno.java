package Matriz;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {

        Scanner objetoNum = new Scanner(System.in);

        double [][] matrizNotasAlunos = new double[3][3];

        for(int l = 0; l<3; l++){
            //percorre as colunas
            for(int c=0;c<3;c++){
                int numNota =0;
                numNota = c+1;
                System.out.print("Digite a nota " + numNota + ": ");
                matrizNotasAlunos[l][c] = objetoNum.nextDouble();


            }
        }

        for(int l = 0; l<3; l++){
            //percorre as colunas
            for(int c=0;c<3;c++){

                System.out.print(matrizNotasAlunos[l][c] + " ");


            }
            System.out.println(" ");
        }
        System.out.println("------------------------------------------------");
        System.out.println("Calculando a media de cada aluno");

        double somaNotas, mediaAluno =0;

        for(int l = 0; l<3; l++){

            somaNotas = 0;

            for(int c=0;c<3;c++){

                somaNotas += matrizNotasAlunos[l][c];

            }

            int numAluno =0;
            numAluno = l+1;

            mediaAluno = somaNotas /3;

            if (mediaAluno>=6){
                System.out.println("Media do aluno " + numAluno + " é: " + mediaAluno + " O aluno está aprovado!.");

            }else {

                System.out.println("Media do aluno " + numAluno + " é: " + mediaAluno + " O aluno está reprovado!.");
            }



        }


    }
}
