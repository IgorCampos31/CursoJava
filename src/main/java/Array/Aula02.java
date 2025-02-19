package Array;

public class Aula02 {
    public static void main(String[] args) {
        //final é uma contante / fixo e pode ser usado em diversas partes
        final int tamanho =3;

        int [] precos = new int[tamanho];

        precos [0] = 18;
        precos [1] = 45;
        precos [2] = 90;


        //lenght - atributo do array que retorna o tamanho dele
        for(int i = 0; i < precos.length; i++){
            System.out.println("O preço do produto " + i + " é: "+precos[i]);

        }

    }
}
