import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner lerN = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasSemanais = lerN.nextDouble();
        horasSemanais /= 4;
        System.out.print("Digite o salário por hora: ");
        double salarioHora = lerN.nextDouble();
        
        double salarioTotal = horasSemanais > 40?(40*salarioHora)+((horasSemanais - 40)*salarioHora*1.5):horasSemanais * salarioHora;
        salarioTotal *= 4;
        
        System.out.println("O salário total do funcionário é: " + salarioTotal);

        lerN.close();
    }
}
//Marcos Augusto Carvalho Da Silva