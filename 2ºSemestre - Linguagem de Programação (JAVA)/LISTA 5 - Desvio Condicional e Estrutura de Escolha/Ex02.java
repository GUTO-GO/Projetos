// 2) Escreva um programa em Java para ler um valor e escrever se é positivo ou negativo
// (considere o valor zero como positivo).

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);

        System.out.print("numero = ");
        double numero = lerN.nextDouble();
        System.out.println(numero>=0?"POSITIVO":"NEGATIVO");

        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva