// 8) Escreva um programa em Java para ler a hora de início e a hora de fim de um jogo de
// Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em
// horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode
// iniciar em um dia e terminar no dia seguinte

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);

        System.out.print("Digite a hora de início do jogo: ");
        int inicio = lerN.nextInt();
        System.out.print("Digite a hora de fim do jogo: ");
        int fim = lerN.nextInt();

        fim = fim <= inicio?(fim + 24):fim;

        System.out.println("A duração do jogo foi de " + (fim - inicio) + " horas.");

        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva