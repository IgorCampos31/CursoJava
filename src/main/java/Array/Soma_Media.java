package Array;

import javax.swing.*;

public class Soma_Media {
    public static void main(String[] args) {
        double [] num = new double[3];

        double media, soma =0;

        for(int i = 0; i < num.length; i++ ){

            num[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para essa posição do array"));


            soma = soma + num[i];

        }

        media = (soma / num.length);

        System.out.println("A soma de todos os numeros do array é: " + soma);
        System.out.println(" ");
        System.out.println("A média dos numeros do array é: " + media);



    }

}
