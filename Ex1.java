package Exercicio2Condicional;

import java.util.Scanner;



public class Ex1 {/* Fazer um programa para ler um n�mero inteiro, e depois dizer se este 
                     n�mero � negativo ou n�o.  */
                                         

	public static void main(String[] args) {

		int num = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um n�mero: ");
		num = sc.nextInt();

		if (num < 0) {
			System.out.println("O n�mero " + num + " � NEGATIVO");
		} else {
			System.out.println("O n�mero " + num + " n�o � NEGATIVO");
		}
		sc.close();

	}

}
