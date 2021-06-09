package Exercicio3While;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int cod = 0;
		int qntAlc = 0, qntGas = 0, qntDies = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Infome o código do combustível: ");
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
				System.out.println("Infome um código válido de 1 à 4: ");
			}
			System.out.println("Infome o código do combustível: ");
			cod = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Álcool: " + qntAlc);
		System.out.println("Gasolina: " + qntGas);
		System.out.println("Diesel: " + qntDies);
		
		
		sc.close();

	}

}
