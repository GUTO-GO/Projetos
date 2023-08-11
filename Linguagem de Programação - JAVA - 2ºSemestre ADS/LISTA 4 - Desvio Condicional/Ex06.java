// 6 - Crie um arquivo chamado ADivisivelPorB.java. Implemente um programa em Java que guarde
// dois valores numéricos inteiros: a e b, informados pelo usuário, sendo a de 0 até 1000 (inclusos) e b
// de 0 a 20 (inclusos). Valide os valores digitados pelo usuário, informando caso não sejam validos.
// Valide, também, se o valor de 1 é maior ou igual ao valor de b, caso não seja, informe ao usuário.
// Exiba na saída padrão a mensagem É divisível quando a for divisível por b ou a mensagem Não é
// divisível, caso contrário. 

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);
        System.out.print("a = ");
        int a = lerN.nextInt();
        System.out.print("b = ");
        int b = lerN.nextInt();

        if((a<=1000 && a>=0) && (b<=20 &&b>=0)){
            System.out.print(a>=b?"":"Valor de a menor e que o valor de b\n");
            System.out.println(a%b == 0?"É divisivel":"Não é divisivel");
        }else{
            System.out.println("VALOR INVALIDO");
        }
        lerN.close();
    }
}
//Marcos Augusto Carvalho da Silva