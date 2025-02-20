package Matriz;

import java.util.Scanner;

public class PessoasEntrevistadas {
    public static void main(String[] args) {

        Scanner scannerPessoa = new Scanner(System.in);

        int numPessoa =0;
        int qtdfilhos =0;


        System.out.println("Entre com o numero de pessoas que serão entrevistadas");
        numPessoa = scannerPessoa.nextInt();

        String [][] nomesFilhos = new String[numPessoa][];

        for (int l =0; l < nomesFilhos.length; l++){

            int numPessoa2 = 0;
            numPessoa2 = l +1;

            System.out.println("Digite a quantidade de filhos que a pessoa " + numPessoa + " tem");
            qtdfilhos = scannerPessoa.nextInt();

            nomesFilhos[l] = new String[numPessoa];

            for(int c=0; c < nomesFilhos[l].length;c++){
                int numFilho = 0;
                numFilho = c +1;

                System.out.println("Digite o nome do filho " + numFilho + " da pessoa " + numPessoa2);


            }


        }

    }
}
