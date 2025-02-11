package AulaIf;

import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {
       /*

        Scanner scanIdade = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade");

        idade = scanIdade.nextInt();

        if (idade >= 18){
            System.out.println("Maior de idade");

        }else {
            System.out.println("Menor de idade");
        }

        */

        //Media de Aluno

        Scanner scanNota = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a nota 1");
        nota1 = scanNota.nextDouble();

        System.out.println("Digite a nota 2");
        nota2 = scanNota.nextDouble();

        System.out.println("Digite a nota 3");
        nota3 = scanNota.nextDouble();

        System.out.println("Digite a nota 4");
        nota4 = scanNota.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        if (media >= 7 ){
            System.out.println("A média é: " + media);
            System.out.println("O aluno está aprovado(a)!");
        } else if (media >= 2){
            System.out.println("A média é: " + media);
            System.out.println("O aluno está de recuperação!");
        } else {
            System.out.println("A média é: " + media);
            System.out.println("O aluno está de reprovado(a)!");
        }
    }
}
