package Exercicio2Condicional;

import java.util.Scanner;

public class Ex5 {/* Com base na tabela abaixo, escreva um programa que leia o código de um
item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar. 

CODIGO	ESPECIFICAÇÃO	PREÇO
1		Cachorro Quente	R$ 4,00
2		X-Salada		R$ 4,50
3		X-Bacon			R$ 5,00
4		Torrada simples	R$ 2,00
5		Refrigerante	R$ 1,50 */ 

	public static void main(String[] args) {
		
		int cod = 0;
		int qnt = 0;
		double total = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do item: ");
		cod = sc.nextInt();
		
		System.out.println("Digite a quantidade: ");
		qnt = sc.nextInt();
		
		if(cod == 1) {
			total = qnt * 4.0;
		}
		
		if(cod == 2) {
			total = qnt * 4.5;
		}
		
		if(cod == 3) {
			total = qnt * 5.0;
		}
		
		if(cod == 4) {
			total = qnt * 2.0;
		}
		
		if(cod == 5) {
			total = qnt * 1.5;
		}
		
		System.out.printf("Total: %.2f%n", total);
		
		sc.close();
	}

}
