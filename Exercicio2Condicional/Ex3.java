package Exercicio3While;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int cod = 0;
		int qntAlc = 0, qntGas = 0, qntDies = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infome o c�digo do combust�vel: ");
		cod = sc.nextInt();
		
		while (cod != 4) {
			if (cod == 1) {
				qntAlc += 1;
			}
			else if (cod == 2) {
				qntGas += 1;
			}
			else if (cod == 3) {
				qntDies += 1;
			}
			else if (cod > 4) {
				System.out.println("Infome um c�digo v�lido de 1 � 4: ");
			}
			System.out.println("Infome o c�digo do combust�vel: ");
			cod = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("�lcool: " + qntAlc);
		System.out.println("Gasolina: " + qntGas);
		System.out.println("Diesel: " + qntDies);
		
		
		sc.close();

	}

}
