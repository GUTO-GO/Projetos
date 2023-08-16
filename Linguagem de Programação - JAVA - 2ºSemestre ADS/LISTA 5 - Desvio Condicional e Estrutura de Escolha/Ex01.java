// 1) Escreva um programa em Java para ler um valor e escrever a mensagem “É MAIOR QUE
// 10!” se o valor lido for maior que 10, caso contrário escrever “NÃO É MAIOR QUE 10!”.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);

        System.out.print("Numero = ");
        double numero = lerN.nextDouble();
        System.out.println(numero>10?"É MAIOR QUE 10!":"NÃO É MAIOR QUE 10!");

        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva