// 9 - Crie um arquivo chamado TestaTiposPrimitivos.java. Implemente um programa em Java que
// declare uma variável de cada um dos tipos primitivos da linguagem Java. Essas variáveis devem ser
// inicializadas com valores adequados. Por fim, exiba os valores dessas variáveis na saída padrão.

public class Ex09 {
    public static void main(String[] args) {
        byte b = 19;
		short s = 1571;
		int i = 100000;
		long l = 2147483648l;
		
		float f = 3.14f;
		double d = 3.141592653589793;
		
		boolean t = true;
		
		char c = 'k';
		
		System.out.printf("%d\n%d\n%d\n%d\n%.2f\n%.15f\n%b\n%c",b,s,i,l,f,d,t,c);
    }
}
//Marcos Augusto Carvalho da Silva