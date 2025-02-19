package Array;

public class Duplicados {
    public static void main(String[] args) {

        int [] arrayNum = {5, 10, 10, 12, 21, 24, 21, 9, 31};

        for(int i = 0; i < arrayNum.length-1; i++){

            for(int k = i+1; k < arrayNum.length; k++){

                if(arrayNum[i] == arrayNum[k] && i != k) {
                    System.out.println("Item duplicado: " + arrayNum[k]);
                }
            }

        }

    }
}
