package AulaIf;


import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero inteiro");

        num = scanNum.nextInt();

        if(num % 2 == 0){
            System.out.println("Esse numero é PAR!");
        }else {
            System.out.println("Esse numero é IMPAR!");
        }


    }
}
