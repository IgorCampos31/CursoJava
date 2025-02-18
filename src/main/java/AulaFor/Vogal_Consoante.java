package AulaFor;

import javax.swing.*;

public class Vogal_Consoante {

    public static void main(String[] args) {
        String nome;
        int nomesVogal = 0;
        int nomesConsoante = 0;

        for (int i = 1; i <=3; i++){
            nome = JOptionPane.showInputDialog("Digite o nome " + i + ":", "Leia com atenção!");


            //trim - remove os espaços em branco
            //toLowerCase - deixa tudo em caixa baixa
            //charAt(0) - Primeira letra variavel nome
            if (nome.trim().toLowerCase().charAt(0) == 'a' ||
                    nome.trim().toLowerCase().charAt(0) == 'e' ||
                    nome.trim().toLowerCase().charAt(0) == 'i' ||
                    nome.trim().toLowerCase().charAt(0) == 'o' ||
                    nome.trim().toLowerCase().charAt(0) == 'u'){

                nomesVogal++;

            }else{

                nomesConsoante++;
            }

        }
        System.out.println("Total com vogal: " + nomesVogal);
        System.out.println("Total com consoante: " + nomesConsoante);

    }
}
