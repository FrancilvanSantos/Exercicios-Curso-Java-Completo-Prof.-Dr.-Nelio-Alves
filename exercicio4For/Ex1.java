package exercicio4For;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = sc.nextInt();
		
		for ( int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				//System.out.println("�mpares de 1 at� " + num + ": ");
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
