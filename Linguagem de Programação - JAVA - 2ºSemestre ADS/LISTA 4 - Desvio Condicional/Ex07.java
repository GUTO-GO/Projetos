// 7 - Crie um arquivo chamado Saudacao.java. Implemente um programa em Java que declare uma
// variável chamada hora. Essa variável deve armazenar a hora do dia. Esse programa deve exibir a
// mensagem Zzzzz se a hora estiver no intervalo [0, 6], Bom dia se a hora estiver no intervalo [7, 11],
// Boa tarde se a hora estiver no intervalo [12, 17] ou Boa noite se a hora estiver no intervalo [18, 23].
// Dê a opção do usuário informar a hora manualmente ou gerar a hora aleatoriamente, sempre
// fazendo todas as validações necessárias. 

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);
        int hora;
        System.out.print("1 - informar a hora manualmente\n2 - gerar a hora aleatoriamente\n- ");
        switch (lerN.nextInt()) {
            case 1:
                System.out.print("informe a hora: ");
                hora = lerN.nextInt();
                break;

            case 2:
                hora = (int)(Math.random()*24);
                System.out.println("hora = " + hora);
                break;
                
            default:
                hora = -1;
                break;
        }
        System.out.println(hora>=0 && hora<=6?"Zzzzz":hora>=7 && hora<=11?"Bom dia":hora>=12 && hora<=17?"Boa tarde":hora>=18 && hora<=23?"Boa noite":"Erro\nInvalidade");
        lerN.close();
    }
}
//Marcos Augusto Carvalho da Silva