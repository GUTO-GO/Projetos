// 11) Desenvolva um programa em Java que receba dois valores numéricos e uma das opções
// que representam uma das operações aritméticas (ler em String e testar como char): ‘+’ , ‘-‘, ‘*’
// e ‘/’. Calcule e mostre a operação efetuada e o seu resultado. 

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);
        Scanner lerS = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double n1 = lerN.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double n2 = lerN.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char escolha = lerS.next().charAt(0);

        double resultado = 0.0;
        String operacao = "";

        switch (escolha) {
            case '+':
                resultado = n1 + n2;
                operacao = "soma";
                break;
            case '-':
                resultado = n1 - n2;
                operacao = "subtração";
                break;
            case '*':
                resultado = n1 * n2;
                operacao = "multiplicação";
                break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                    operacao = "divisão";
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Operação inválida.");
                System.exit(0);
        }

        System.out.println("Resultado da " + operacao + ": " + resultado);

        lerN.close();
        lerS.close();
    }
}
//Marcos Augusto Carvalho Da Silva