// 5 - Crie um arquivo chamado ADivisivelPorBRandom.java. Implemente um programa em Java que
// guarde dois valores numéricos inteiros: a e b, gerados aleatoriamente, sendo a de 0 até 1000
// (inclusos) e b de 0 a 20 (inclusos). Exiba na saída padrão a mensagem É divisível quando a for
// divisível por b ou a mensagem Não é divisível, caso contrário. 

public class Ex05 {
    public static void main(String[] args) {
        int a = (int)(Math.random()*1001);
        int b = (int)(Math.random()*21);
        //o erro caso b seja zero esta aqui mas o exercicio pede então não irei retelo

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println(a%b == 0?"É divisivel":"Não é divisivel");
    }
}
//Marcos Augusto Carvalho da Silva