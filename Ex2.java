package Exercicio2Condicional;

import java.util.Scanner;

public class Ex2 {/*Fazer um programa para ler um n�mero inteiro e dizer 
                    se este n�mero � par ou �mpar.*/ 

	public static void main(String[] args) {

		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero ");
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
