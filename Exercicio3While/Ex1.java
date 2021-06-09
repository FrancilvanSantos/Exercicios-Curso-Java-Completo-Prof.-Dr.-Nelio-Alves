package Exercicio3While;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int senha = 0;

		Scanner sc = new Scanner(System.in);
	System.out.println("Informe a senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida!");
			System.out.println("Informe a senha: ");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		sc.close();
	}

}
