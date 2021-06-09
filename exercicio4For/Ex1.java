package exercicio4For;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		for ( int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				//System.out.println("Ímpares de 1 até " + num + ": ");
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
