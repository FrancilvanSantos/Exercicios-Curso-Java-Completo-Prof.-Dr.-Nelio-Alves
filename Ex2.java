package Exercicio2Condicional;

import java.util.Scanner;

public class Ex2 {/*Fazer um programa para ler um número inteiro e dizer 
                    se este número é par ou ímpar.*/ 

	public static void main(String[] args) {

		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um número ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		sc.close();
	}

}
