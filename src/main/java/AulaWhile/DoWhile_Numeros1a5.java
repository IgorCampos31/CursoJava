package AulaWhile;

import javax.swing.*;

public class DoWhile_Numeros1a5 {

    public static void main(String[] args) {

        double numero;
        int contador;

        contador = 0;

        do{
            numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero!"));

            if (numero <1 || numero >5){

                System.out.println("Numero incorreto! Tente Novamente!");
                contador++;
            }

        }while(numero <1 || numero >5);

        System.out.println("Parabéns, você digitou um numero entre 1 e 5!");
        System.out.println("Você tentou um total de " + contador + " vezes!");

    }
}
