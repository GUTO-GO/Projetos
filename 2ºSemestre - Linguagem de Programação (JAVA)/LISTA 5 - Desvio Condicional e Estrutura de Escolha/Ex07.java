// 7) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
// iguais) e escrevê-los em ordem crescente.

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);
        System.out.print("Valor 1 = ");
        double n1 = lerN.nextDouble();
        System.out.print("Valor 2 = ");
        double n2 = lerN.nextDouble();

        System.out.println(n1>n2?n1 + " - " + n2:n2 + " - " + n1);

        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva