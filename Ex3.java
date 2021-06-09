package Exercicio2Condicional;

import java.util.Scanner;

public class Ex3 {/* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
                     "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos 
                      são múltiplos entre si. Atenção: os números devem poder ser digitados em 
                      ordem crescente ou decrescente. */

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número");
		a = sc.nextInt();
		
		System.out.println("Digite o sugundo número");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		sc.close();
	}

}
