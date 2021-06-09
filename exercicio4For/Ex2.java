package exercicio4For;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		int in = 0, out = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite o número: ");
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				in += 1;
			}
			else
				out += 1;
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
	
		sc.close();
	}
}
