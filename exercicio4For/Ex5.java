package exercicio4For;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n = sc.nextInt();
		
		int fat = 1;
		
		for (int i = 1; i <= n; i++) {
			
			fat = fat * (n-i);
			System.out.println(fat);
		}
		sc.close();
	}
}
