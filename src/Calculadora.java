import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b;
		String opc = "";
		double resultado = 0;

		System.out.println("Digite aqui o primeiro valor: ");
		a = teclado.nextInt();
		System.out.println("Digite o tipo de operação(+, -, * ou /): ");
		opc = teclado.next();
		System.out.println("Digite aqui o segundo valor valor: ");
		b = teclado.nextInt();
		
		
		//Switch para escolha de operação
		switch (opc) {
		case "+":
			resultado = soma(a, b);
			break;
		case "-":
			resultado = subtracao(a, b);
			break;
		case "*":
			resultado = multiplicacao(a, b);
			break;
		case "/":
			resultado = divisao(a, b);
			break;
		default:
			System.out.println("Opção inexistente: " + opc);
		}

		System.out.println();
		System.out.println("Resultado: " + resultado);

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static double divisao(double a, double b) {
		return a / b;
	}

}