package exercicio4For;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double n = sc.nextDouble();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite o valor de A: ");
			double a = sc.nextDouble();

			System.out.println("Digite o valor de B: ");
			double b = sc.nextDouble();

			double divisao = a / b;
			
			if (b == 0) {
				System.out.println("Divis�o imposs�vel");
			} else {
				System.out.println(divisao);
			}
			sc.close();
		}
	}
}