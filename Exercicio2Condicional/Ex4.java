package Exercicio2Condicional;

import java.util.Scanner;

public class Ex4 {/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração 
do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
tendo uma duração mínima de 1 hora e máxima de 24 horas. */
	
	public static void main(String[]args) {

	int horaInicial, horaFinal, duracao;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a hora de início: ");
	horaInicial = sc.nextInt();
	
	System.out.println("Digite a hora final: ");
	horaFinal = sc.nextInt();
	
	if (horaInicial < horaFinal) {
		duracao = horaFinal - horaInicial;
	}
	else {
		duracao = 24 - horaInicial + horaFinal;
	}
	
	System.out.println("O jogo durou " + duracao + "h.");
	sc.close();
}

}