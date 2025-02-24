package Metodos.Ex3;

public class MetodoGet_Set {
    public static void main(String[] args) {
        //Instanciando - usando todas as propriedades e tudo que tem na classe
        ItensLoja produto1 = new ItensLoja("Celular", 50, "Motorola");

        //Aqui podemos alterar os atributos da classe pq ele está definido como public

        produto1.nomeProduto = "Sapato";
        produto1.quantidadedProduto = 30;

        System.out.println(produto1.nomeProduto);
        System.out.println(produto1.quantidadedProduto);

        //Para acessar os itens de um atributo privat fora da classe, precisamos usar o Get
        //Para alterar o valor privat precisamos alterar pelo metodo set
        produto1.setFabricanteProduto("Apple");
        System.out.println(produto1.getFabricanteProduto());
    }
}
