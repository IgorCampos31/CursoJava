package AulaWhile;

import javax.swing.*;

public class MaiorMenor {
    public static void main(String[] args) {

        int numAtual, maior, menor;
        boolean primeiro = true;

        numAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        maior = 0;

        while(numAtual >= 0){
            if(numAtual > maior){

                maior = numAtual;
            }else{
                menor = numAtual;
            }

        }


    }
}
