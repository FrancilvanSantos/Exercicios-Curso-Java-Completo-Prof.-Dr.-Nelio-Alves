package exercicio4For;

import java.util.Scanner;

public class exemplo1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int soma = 0, nr = 0;
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o número: ");
			nr = sc.nextInt(); 
			soma += nr; 
			
		}
		System.out.println("soma: " + soma);
		
		sc.close();

	}

}
