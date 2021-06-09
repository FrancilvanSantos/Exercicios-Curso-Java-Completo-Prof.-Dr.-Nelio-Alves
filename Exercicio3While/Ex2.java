package Exercicio3While;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a coordenada X: ");
		int x = sc.nextInt();
		System.out.println("Informe a coordenada Y: ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("primeiro\n");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			System.out.println("Informe a coordenada X: ");
			x = sc.nextInt();
			System.out.println("Informe a coordenada Y: ");
			y = sc.nextInt();
			//x = sc.nextInt();
			//y = sc.nextInt();
		}
		System.out.println("Origem");
		
		sc.close();
	}
}

