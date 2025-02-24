package Metodos.Ex3;

public class ItensLoja {
    //Public - Modificador de acesso
    //private - só pode ser acessado dentro da propria classe ou atraves do Get/Set
    public String nomeProduto;
    public int quantidadedProduto = 0;
    private String fabricanteProduto;


    //Get - Obtem os valores das variaveis / atributos de uma classe
    public String getNomeProduto() {

        //return - Retorna o valor do atributo
        return nomeProduto;
    }
    //Set - Atribuir / mudar valores de uma variavel de uma classe
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadedProduto() {
        return quantidadedProduto;
    }

    public void setQuantidadedProduto(int quantidadedProduto) {
        this.quantidadedProduto = quantidadedProduto;
    }

    public String getFabricanteProduto() {
        return fabricanteProduto;
    }

    public void setFabricanteProduto(String fabricanteProduto) {
       if(fabricanteProduto.equals("Apple")){
           System.out.println("Nao trabalhamos com os produtos desse fabricante");
       }else{

        this.fabricanteProduto = fabricanteProduto;
       }
    }

    public ItensLoja(String nProduto, int qtdProdutos, String fProduto){

        System.out.println("Nome: " + nProduto);
        System.out.println("Quantidade: " + qtdProdutos);
        System.out.println("Fabricante: " + fProduto);
        System.out.println("------------------------\n");
    }

}
