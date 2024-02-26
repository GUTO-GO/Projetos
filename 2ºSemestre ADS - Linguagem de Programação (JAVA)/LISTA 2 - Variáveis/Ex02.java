// 2 - Crie um arquivo chamado ExibeNumeroAleatorio.java. Implemente um programa em Java que
// gere um número real aleatório entre 0 e 100. Esse número deve ser armazenado em uma variável do
// tipo double chamada numeroAleatorio. Por fim, exiba o valor dessa variável na saída padrão.

import java.util.Random;
public class Ex02 {
    public static void main(String[] args) {
        Random gerador = new Random();
        boolean a = true;
        boolean b = true;
        while (a==true||b==true){
            int numero = gerador.nextInt(101);
            System.out.println(numero);
        }
    }
}
//Marcos Augusto Carvalho da Silva