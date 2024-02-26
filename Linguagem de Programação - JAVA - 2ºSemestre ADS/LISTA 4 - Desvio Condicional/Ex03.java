// 3 - Crie um arquivo chamado VerificaValorProdutoRandom.java. Gere dois números aleatórios
// entre 1 e 1000 (inclusos), atribuindo as variáveis precoProduto1 e precoProduto2. O programa deve
// exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
// Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
// deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
// exibida. 

public class Ex03 {
    public static void main(String[] args) {
        int precoProduto1 = (int)(Math.random()*1000 + 1);
        int precoProduto2 = (int)(Math.random()*1000 + 1);

        System.out.println("Preço do Produto 1: " + precoProduto1);
        System.out.println("Preço do Produto 2: " + precoProduto2);
        
        if (precoProduto1 < precoProduto2) {
            System.out.println("O produto 1 é o mais barato.");
        } else if (precoProduto1 > precoProduto2) {
            System.out.println("O produto 2 é o mais barato.");
        } else {
            System.out.println("Os preços dos dois produtos são iguais.");
        }
    }
}
//Marcos Augusto Carvalho da Silva