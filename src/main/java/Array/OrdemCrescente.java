package Array;

import javax.swing.*;
import java.util.Arrays;


public class OrdemCrescente {
    public static void main(String[] args) {
        int vezes = 3;
        int [] arrayNum = new int[vezes];

        for(int i =0; i < vezes; i++){
            arrayNum[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

        }

        System.out.println("Numeros na ordem digitada:");
        for (int i : arrayNum){

            System.out.println(i);
        }

        System.out.println("Numeros na ordem crescente:");

        //sort - metodo para organizar os numeros em ordem crescente
        Arrays.sort(arrayNum);

        for (int i : arrayNum){

            System.out.println(i);
        }

    }
}
