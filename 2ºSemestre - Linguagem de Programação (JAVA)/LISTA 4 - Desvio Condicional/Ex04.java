// 4 - Crie um arquivo chamado VerificaValorProduto.java. Solicite ao usuário que digite os valores
// para as variáveis precoProduto1 e precoProduto2. O programa deve testar o valor digitado pelo
// usuário, para as duas variáveis e caso não estejam na faixa de 1 até 1000 (inclusos), exibir a
// mensagem VALOR INVALIDO e finalizer o programa. Caso os valores digitados sejam válidos,
// exibir a mensagem O produto 1 é o mais barato quando o preço do primeiro produto for menor.
// Caso contrário, se o preço do segundo produto for menor, a mensagem O produto 2 é o mais barato
// deve ser exibida. Caso contrário, a mensagem Os preços dos dois produtos são iguais é que deve ser
// exibida.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);
        System.out.print("Preço do Produto 1: ");
        int precoProduto1 = lerN.nextInt();

        System.out.print("Preço do Produto 2: ");
        int precoProduto2 = lerN.nextInt();
        
        if((precoProduto1<=1000 && precoProduto1>=1) && (precoProduto2<=1000 &&precoProduto2>=1)){
            if (precoProduto1 < precoProduto2) {
                System.out.println("O produto 1 é o mais barato.");
            } else if (precoProduto1 > precoProduto2) {
                System.out.println("O produto 2 é o mais barato.");
            } else {
                System.out.println("Os preços dos dois produtos são iguais.");
            }
        }else{
            System.out.println("VALOR INVALIDO");
        }
        lerN.close();
    }
}
//Marcos Augusto Carvalho da Silva