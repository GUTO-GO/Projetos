// 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
// forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
// compradas, calcule e escreva o custo total da compra.

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);

        System.out.print("número de maçãs = ");
        double maca = (double)lerN.nextInt();
        System.out.printf("custo total = R$%.2f\n",maca>=12?maca*1.0:maca*1.3);

        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva