package exercicio4For;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double n = sc.nextDouble();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o valor de A: ");
			double a = sc.nextDouble();
			
			System.out.println("Digite o valor de B: ");
			double b = sc.nextDouble();
			
			System.out.println("Digite o valor de C: ");
			double c = sc.nextDouble();
			
			double media = (2.0 * a + 3.0 * b + 5.0 * c)/10.0;
			
			System.out.printf("%.1f%n", media);
			
		}
		
		
		sc.close();

	}

}
