package Matriz;

import java.util.Scanner;

public class Diagonais {

    public static void main(String[] args) {
        Scanner objetoNumero = new Scanner(System.in);

        int [][] numero = new int[3][3];
        int[] diagonal = new int[3];
        int soma =0;


        for (int l = 0; l<3;l++){
            for (int c = 0; c<3;c++){

                System.out.println("Digite um numero na linha: " + l + " - coluna: " + c);
                numero[l][c] = objetoNumero.nextInt();

                if (l==c){
                    soma = soma + numero[l][c];
                    diagonal[l] = numero[l][c];
                }


            }

        }

        for (int l = 0; l<3;l++){
            for (int c = 0; c<3;c++){

                System.out.print(numero[l][c] + " ");


            }

            System.out.println(" ");

        }

        System.out.println("-------------------------");


        System.out.println("Os numeros da diagonal são: " + diagonal[0] + ", " + diagonal[1] + ", " + diagonal[2] );

        System.out.println("-------------------------");

        System.out.println("A soma da diagonal é: " + soma);

    }
}
