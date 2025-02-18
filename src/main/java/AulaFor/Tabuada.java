package AulaFor;

import javax.swing.*;

public class Tabuada {

    public static void main(String[] args) {
        int n1, resultado;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero para descobrir a tabuada: "));

        for(int contador = 1; contador<=10; contador++){
            resultado = n1 * contador;
            System.out.println(n1 + "x" + contador + "= " + resultado);
        }

    }
}
