package Exercicio2Condicional;

import java.util.Scanner;



public class Ex1 {/* Fazer um programa para ler um número inteiro, e depois dizer se este 
                     número é negativo ou não.  */
                                         

	public static void main(String[] args) {

		int num = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um número: ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("O número " + num + " é NEGATIVO");
		} else {
			System.out.println("O número " + num + " não é NEGATIVO");
		}
		sc.close();

	}

}
