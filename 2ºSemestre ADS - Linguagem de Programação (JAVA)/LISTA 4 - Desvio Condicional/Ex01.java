// 1 - Crie um arquivo chamado AprovadoReprovadoRandom.java. Gere um número aleatório com
// valores entre 0 e 10 (inclusos) e atribua a variável nota. O programa deve exibir a mensagem
// REPROVADO quando a nota do aluno for menor do que 6 ou APROVADO caso contrário. 

public class Ex01 {
    public static void main(String[] args) {
        float nota = (float)((int)(Math.random() * 1001))/100;
        System.out.println("nota = " + nota);
        System.out.println(nota<6?"REPROVADO":"APROVADO");
    }
}
//Marcos Augusto Carvalho da Silva