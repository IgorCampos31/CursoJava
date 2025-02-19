package AulaWhile;

import java.util.Scanner;


public class DoWhile_Urna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String c1, c2, c3;

        int v1 = 0, v2 = 0, v3 =0;

        int votacao, totalVotos, maiorVotacao;


        System.out.println("Nome Candidato 1");
        c1 = scanner.nextLine();

        System.out.println("Nome Candidato 2");
        c2 = scanner.nextLine();

        System.out.println("Nome Candidato 3");
        c3 = scanner.nextLine();

        totalVotos = 0;

        do{
            System.out.println("Digite o numero do seu candidato para votar");
            votacao = scanner.nextInt();

            switch(votacao){
                case 1: {

                    v1++;
                    totalVotos++;
                    break;
                }
                case 2: {

                    v2++;
                    totalVotos++;
                    break;
                }
                case 3: {

                    v3++;
                    totalVotos++;
                    break;
                }
                default:

                    if(votacao != 0 ){

                       System.out.println("Voto Invalido");
                    }

            }
        }while(votacao != 0);

        System.out.println(" ");
        System.out.println(c1 + " - " + v1 + " votos");
        System.out.println(c2 + " - " + v2 + " votos");
        System.out.println(c3 + " - " + v3 + " votos");
        System.out.println("Total votos da eleição: " + totalVotos);

        maiorVotacao = v1;

        if(v2 > maiorVotacao){
            maiorVotacao = v2;
        }
        if(v3 > maiorVotacao){
            maiorVotacao = v3;
        }

        System.out.println("Candidato Vencedor" );
        System.out.println(" ");

        if (v1==maiorVotacao){
            System.out.println(c1 + " ganhou a votação com um total de " + v1 + " votos!");
        } else if (v2 == maiorVotacao) {
            System.out.println(c2 + " ganhou a votação com um total de " + v2 + " votos!");
        }else{
            System.out.println(c3 + " ganhou a votação com um total de " + v3 + " votos!");
        }


    }
}
