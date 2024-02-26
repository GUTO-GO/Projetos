// 5) Escreva um programa em Java para ler o ano atual e o ano de nascimento de uma pessoa.
// Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário
// considerar o mês em que a pessoa nasceu).

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);
        System.out.print("Ano atual = ");
        int atual = lerN.nextInt();
        System.out.print("Ano de nascimento = ");
        int nascimento = lerN.nextInt();
        
        nascimento = atual - nascimento;
        System.out.println(nascimento>=18&&nascimento<70?"Deve votar esse ano":nascimento>=16||nascimento>=70?"Pode votar esse ano":"Não pode votar");
        
        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva