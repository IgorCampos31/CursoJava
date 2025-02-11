package AulaIf;

import javax.swing.*;

public class FuncaoIf_Else_E_Ou {

    public static void main(String[] args) {
        /*
        || - OU (ou um ou outro verdadeiro)
        && - E (os dois verdadeiros)

        */
        String fruta;

        fruta = JOptionPane.showInputDialog("Digite o nome da fruta: ");

        if(fruta.equals("Maça") || fruta.equals("Banana")){
            JOptionPane.showMessageDialog(null, "A fruta é " + fruta);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Fruta invalida");

        }
    }
}
