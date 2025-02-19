package AulaWhile;

import javax.swing.*;

public class DoWhile_Positivo_Negativo {
    public static void main(String[] args) {
        int numero;
        int positivo =0, negativo = 0, contador;


        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: ", "Ou digite 0 para sair"));

            if(numero > 0){
                System.out.println(numero + " Numero Positivo!");
                positivo++;
            }else {
                System.out.println(numero + " Numero negativo");
                negativo++;
            }
        }while(numero != 0);

        contador = (positivo + negativo);

        System.out.println("Numero correto!");
        System.out.println("Você precisou de " + contador + " vezes para acertar.");
        System.out.println("Você digitou " + positivo + " numeros positivos");
        System.out.println("Você digitou " + negativo + " numeros negativos");


    }
}
