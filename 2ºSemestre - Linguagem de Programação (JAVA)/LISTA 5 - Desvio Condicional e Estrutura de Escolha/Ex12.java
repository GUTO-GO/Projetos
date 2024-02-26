import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = lerN.nextDouble();

        System.out.print("Digite o código de origem: ");
        int codigo = lerN.nextInt();

        String regiao = "";
        double frete = 0.0;
        double valorFinal = 0.0;

        switch (codigo) {
            case 1:
                regiao = "Norte";
                frete = preco * 0.10;
                break;
            case 2:
            case 5:
            case 9:
                regiao = "Sul";
                frete = preco * 0.03;
                break;
            case 3:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                regiao = "Leste";
                frete = preco * 0.012;
                break;
            case 7:
            case 20:
                regiao = "Oeste";
                frete = preco * 0.073;
                break;
            default:
                regiao = "Importado";
                frete = preco * 0.222;
                break;
        }

        valorFinal = preco + frete;

        System.out.println("Região de procedência: " + regiao);
        System.out.println("Valor calculado do frete: R$ " + frete);
        System.out.println("Valor final a ser pago: R$ " + valorFinal);

        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva