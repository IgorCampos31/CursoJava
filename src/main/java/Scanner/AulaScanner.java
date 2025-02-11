package Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AulaScanner {
    public static void main(String[] args){
    //Scanner que le o teclado
        java.util.Scanner objeto = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String nome = objeto.nextLine();

        System.out.println("Nome digitado: " + nome);
    }
}
