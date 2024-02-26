// 4) Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
// aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
// ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
// também a média calculada.

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);
        System.out.print("nota da primeira avaliações = ");
        double nota1 = lerN.nextDouble();
        System.out.print("nota da segunda avaliações = ");
        double nota2 = lerN.nextDouble();

        System.out.printf("Media = %.2f\nAluno - %s\n",(nota1+nota2)/2.0,(nota1+nota2)/2.0>=6?"APROVADO":"REPROVADO");

        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva