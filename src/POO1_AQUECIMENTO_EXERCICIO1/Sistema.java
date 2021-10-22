package POO1_AQUECIMENTO_EXERCICIO1;

import java.util.Scanner;

public class Sistema {
    private static Scanner capturarDados (String mensagem){
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void instanciarProduto(){
        String nome = capturarDados("Digite o nome do produto: ").nextLine();
        double preco = capturarDados("Digite o preço do produto: ").nextDouble();
        ServiceProduto.instanciarProduto(nome,preco);
    }

    public static void adicionarProdutos(){
        int numeroProdutos = capturarDados("Digite quantos produtos deseja adicionar").nextInt();
        ServiceProduto.adicionarProdutos(numeroProdutos);
    }


}
