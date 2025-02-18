package AulaWhile;

import javax.swing.*;
import java.util.Random;

public class Randomizer {

    public static void main(String[] args) {
        Random gerador = new Random();
        boolean acertou = false;
        int palpite, tentativas = 0;

        int numero = gerador.nextInt(101);

        //System.out.println(numero);

        while(acertou==false){
            palpite = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 e 100"));

            tentativas++;

            if(palpite==numero){
                System.out.println("O numero digitado é exatamente o sorteado.");
                System.out.println("Você acertou em " + tentativas + " tentativas");
                acertou = true;

            } else if (palpite > numero) {
                System.out.println("O numero digitado é MAIOR que o sorteado");
            }else{
                System.out.println("O numero digitado é MENOR que o sorteado");
            }
        }

    }
}
