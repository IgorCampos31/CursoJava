package AulaIf;

import java.util.Scanner;

public class FuncaoIf1 {

    public static void main(String[] args) {

        Scanner scanNum = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero inteiro");

        num = scanNum.nextInt();

        if (num >= 10){
            System.out.println("O numero é maior que 10");
        }
        else {
            System.out.println("O numero é menor que 10");

        }
        System.out.println("O numero é: " + num);
    }
}
