// 6) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
// iguais) e escrever o maior deles.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);

        System.out.print("valor 1 = ");
        double n1 = lerN.nextDouble();
        System.out.print("valor 2 = ");
        double n2 = lerN.nextDouble();
        
        System.out.println(n1>n2?"O valor 1 é maior - " + n1:n2>n1?"O valor 2 é maior - " + n2:"Os valores são iguais - " + n1 + " - " + n2);
        
        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva