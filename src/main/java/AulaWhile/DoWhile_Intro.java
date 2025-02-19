package AulaWhile;

public class DoWhile_Intro {
    public static void main(String[] args) {
        /*
        int contador = 1;

        //do - primeiro faça
        //executa pelo menos uma vez e depois ele testa a condição
        do{

            System.out.println(("Numero: " + contador));
            contador++;

        }while(contador <= 10);
        */

        //contar de 10 a 0

        int contador = 10;

        do{
            System.out.println("Numero: " + contador);
            contador--;
          }while(contador>=1);
    }
}
