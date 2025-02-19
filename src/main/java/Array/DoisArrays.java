package Array;

import java.util.Arrays;
import java.util.HashSet;

public class DoisArrays {
    public static void main(String[] args) {

        String [] array1 = {"A", "B", "C", "D", "E", "F"};
        String [] array2 = {"A", "H", "I", "J", "K", };

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        //HashSet é uma coleção de itens onde cada item é unico e é encontrado no pacote java.util
        HashSet<String> itensRepetidos = new HashSet<String>();

        for(int i =0; i < array1.length; i++){
            for (int k =0; k < array2.length - 1; k++){

                if(array1[i].equals(array2[k])){

                    itensRepetidos.add(array1[i]);
                }
            }

        }

        System.out.println("Itens: " + itensRepetidos );
    }
}
