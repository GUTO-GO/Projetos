// 2 - Crie um arquivo chamado AprovadoReprovado.java. Solicite ao usuário que digite o valor para
// a variável nota. O programa deve testar o valor digitado pelo usuário e caso não esteja na faixa de 0
// até 10 (inclusos), exibir a mensagem VALOR INVALIDO e finalizer o programa. Caso o valor
// digitado seja válido, exibir a mensagem REPROVADO quando a nota do aluno for menor do que 6
// ou APROVADO caso contrário. 

import java.util.Scanner;

public class Ex02{
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);
        System.out.print("Digite a valor da nota: ");
        float nota = lerN.nextFloat();
        
        if(!(nota>10 || nota<0)){
            System.out.println("nota = " + nota);
            System.out.println(nota<6?"REPROVADO":"APROVADO");
        }else{
            System.out.println("VALOR INVALIDO");
        }
        lerN.close();
    }
}
//Marcos Augusto Carvalho da Silva