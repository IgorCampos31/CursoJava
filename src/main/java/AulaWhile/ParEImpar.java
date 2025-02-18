package AulaWhile;

import javax.swing.*;

public class ParEImpar {

    public static void main(String[] args) {
        int i, par, impar;
        i = 0;
        par = 0;
        impar = 0;

        i = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));

        while(i >= 0){
            System.out.println(i);

            if (i>=0){
                if(i % 2 == 0){
                    par++;
                }else{

                    impar++;
                }
            }
            i--;

            }
        System.out.println("Quantidade de numeros pares: " + par);
        System.out.println("Quantidade de numeros impares: " + impar);
        }
    }

