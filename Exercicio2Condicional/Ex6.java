package Exercicio2Condicional;

import java.util.Scanner;

public class Ex6 {/* Voc� deve fazer um programa que leia um valor qualquer e apresente 
uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
este valor se encontra. Obviamente se o valor n�o estiver em nenhum destes intervalos,
 dever� ser impressa a mensagem �Fora de intervalo�.  */

	public static void main(String[] args) {
		double num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite um n�mero: ");
		num = sc.nextDouble();
		
		if(num < 0 || num > 100) {
			System.out.println("Fora do Intervalo!");
		}
		
		else if(num >= 0 & num <= 25) {
			System.out.println("Intervalo (0, 25)");
		}
		
		else if(num <= 50) {
			System.out.println("Intervalo (25, 50)");
		}
		
		else if(num <= 75) {
			System.out.println("Intervalo (50, 75)");
		}
		
		else if(num <= 100) {
			System.out.println("Intervalo (75, 100)");
		}
		
		
		
		sc.close();

	}

}
