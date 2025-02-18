package AulaFor;

import javax.swing.*;

public class Fatorial {
    public static void main(String[] args) {
        int n1, fatorial;

        fatorial = 1;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com um numero positivo."));

        for (int contador = n1; contador >= 1; contador--){

            //fatorial = fatorial * contador;
            System.out.printf("%d x %d = %d \n", fatorial, contador, fatorial = fatorial * contador);

        }
        System.out.println("O fatorial de " + n1 + ": " + fatorial);
    }
}
