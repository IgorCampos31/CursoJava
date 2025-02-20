package Matriz;

public class Introducao {
    public static void main(String[] args) {

        //[] - array
        // [] [] - matriz
        //Matriz - linhas e coluna
        //Primeiro indice são as linhas
        //Segundo indice são as colunas
        //Cada linha da matriz é um array

        int [][] numeros = new int [3][4];
        int contador = 1;

        //Populando a matriz
        //Percorre as linhas
        for(int l = 0; l<3; l++){
            //percorre as colunas
            for(int c=0;c<4;c++){

                numeros[l][c] = contador;
                contador++;

            }
        }

        //Imprimindo a matriz
        //Percorre as linhas
        for(int l = 0; l<3; l++){
            //percorre as colunas
            for(int c=0;c<4;c++){

                System.out.print(numeros[l][c] + " ");

            }

            System.out.println("");
        }

        System.out.println("--------------------------------------------------------");

        int linha =4;
        int coluna =3;

        String[][] matrizLetras = new String[linha][coluna];
        String [] array1 = {"A", "B", "C"};
        String [] array2 = {"D", "E", "F"};
        String [] array3 = {"G", "H", "I"};
        String [] array4 = {"J", "K", "L"};

        matrizLetras[0] = array1;
        matrizLetras[1] = array2;
        matrizLetras[2] = array3;
        matrizLetras[3] = array4;

        for(int l = 0; l<4; l++){
            //percorre as colunas
            for(int c=0;c<3;c++){

                System.out.print(matrizLetras[l][c] + " ");

            }

            System.out.println("");
        }








    }
}
