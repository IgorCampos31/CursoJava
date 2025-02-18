package AulaFor;

import javax.swing.*;

public class Medias {

    public static void main(String[] args) {

        String aluno;
        float n1, n2, media, somaMedias, mediaTurma;

        somaMedias = 0;


        for(int contador = 1; contador<=3; contador++){
            aluno = JOptionPane.showInputDialog("Nome do Aluno");

            n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota: "));
            n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));

            media = (n1+n2)/2;
            somaMedias = somaMedias + media;

            System.out.println("Aluno(a): " + aluno);
            System.out.println("Media: " + media);

            if (media >=6){

                System.out.println("Aluno(a) Aprovado(a)");
            }else {

                System.out.println("Aluno(a) Reprovado(a)");
            }
        }
        mediaTurma = somaMedias / 3;
                System.out.println("\n A média da Turma: " + mediaTurma);
    }
}
