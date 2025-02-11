package AulaIf;

import javax.swing.*;

public class Switch {

    public static void main(String[] args) {

        String fruta;

        fruta = JOptionPane.showInputDialog("Digite o nome de uma fruta");

        //switch - avalia o valor de uma variavel e dependendo do resultado
        //ele entra em um caso e executa a ação

        switch (fruta){

            case "Banana": case "Laranja": case "Uva":
                System.out.println("Voce digitou " + fruta);
                break;

            default:
                System.out.println("Voce não digitou uma fruta valida");

        }

    }
}
