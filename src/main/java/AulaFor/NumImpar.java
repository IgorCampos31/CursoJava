package AulaFor;

import javax.swing.*;

public class NumImpar {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero positivo maior que 1","LEIA COM ANTEÇÃO!" ));

        for(int contador = 1; contador <= numero; contador++){

            if (contador % 2 ==1){

                System.out.println("Impar: " + contador);
            }

        }

    }
}
