package Exercicio2Condicional;

import java.util.Scanner;

public class Ex3 {/* Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
                     "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos 
                      s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em 
                      ordem crescente ou decrescente. */

	public static void main(String[] args) {
		int a, b;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero");
		a = sc.nextInt();
		
		System.out.println("Digite o sugundo n�mero");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o multiplos");
		}
		else {
			System.out.println("N�o s�o multiplos");
		}
		sc.close();
	}

}
