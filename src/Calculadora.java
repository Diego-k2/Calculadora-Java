import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		 int a, b;
		 
		 System.out.println("Digite aqui o primeiro valor");
		 a = teclado.nextInt();
		 System.out.println("Digite aqui o segundo valor valor");
		 b = teclado.nextInt();
		  
		 int soma = soma(a,b);
		 int subtração = subtração(a,b);
		 int multiplicação = multiplicação (a,b);
		 double divisão = divisão (a,b);

		 System.out.println(soma);
		 System.out.println(subtração);
		 System.out.println (multiplicação);
		 System.out.println(divisão);
		 
		 
	}
	

	
	public static int soma (int a, int b) {
		return  a + b;
	}
	
	public static int subtração (int a, int b) {
		return a - b;
	}
	
	public static int multiplicação (int a, int b) {
		return a * b;
	}
	
	public static double divisão (double a, double b) {
		return a / b;
	}

}
