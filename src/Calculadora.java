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
		 int subtra��o = subtra��o(a,b);
		 int multiplica��o = multiplica��o (a,b);
		 double divis�o = divis�o (a,b);

		 System.out.println(soma);
		 System.out.println(subtra��o);
		 System.out.println (multiplica��o);
		 System.out.println(divis�o);
		 
		 
	}
	

	
	public static int soma (int a, int b) {
		return  a + b;
	}
	
	public static int subtra��o (int a, int b) {
		return a - b;
	}
	
	public static int multiplica��o (int a, int b) {
		return a * b;
	}
	
	public static double divis�o (double a, double b) {
		return a / b;
	}

}
