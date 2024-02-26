// 10) Escreva um programa em Java para ler o salário fixo e o valor das vendas efetuadas pelo
// vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das
// vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu
// salário total.

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salario = lerN.nextDouble();
        System.out.print("Digite o valor total das vendas efetuadas pelo vendedor: ");
        double Vendas = lerN.nextDouble();

        double comissao;
        if (Vendas <= 1500.0) {
            comissao = Vendas * 0.03;
        } else {
            comissao = 1500.0 * 0.03 + (Vendas - 1500.0) * 0.05;
        }
        double Total = salario + comissao;

        System.out.println("Comissão: R$ " + comissao);
        System.out.println("Salário total: R$ " + Total);

        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva