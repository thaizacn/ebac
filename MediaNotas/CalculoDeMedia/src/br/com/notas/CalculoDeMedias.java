package br.com.notas;

import java.util.Scanner;

public class CalculoDeMedias {
	
	
	public static void main(String[] args) {

		Scanner notas = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		int nota1 = notas.nextInt();
		System.out.println("Digite a segunda nota: ");
		int nota2 = notas.nextInt();
		System.out.println("Digite a terceira nota: ");
		int nota3 = notas.nextInt();
		System.out.println("Digite a quarta nota: ");
		int nota4 = notas.nextInt();
		
		int media = nota1 + nota2 + nota3 + nota4;
		int mediaFinal = media / 4;
		
		System.out.println("Sua mÃ©dia final Ã©: " + mediaFinal);

		if(mediaFinal >= 7) {
			System.out.println("Parabéns, você foi aprovado!");
		} else if(mediaFinal >= 5) {
			System.out.println("Tente novamente, você ficou de recuperação!");
		} else {
			System.out.println("Infelizmente, você foi reprovado!");
		}
	}
	

}
