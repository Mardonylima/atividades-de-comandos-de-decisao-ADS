//Questão 06. Escreva um algoritmo que receba um número e imprima uma das
// mensagens: “é múltiplo de 3” ou “não é múltiplo de 3”.

package projetojava;

import java.util.Scanner;

public class questao6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("informe um valor: ");
		int n1 = entrada.nextInt();

		if (n1 % 3 == 0) {
			System.out.print(n1 + " é multiplo de 3");
		} else {
			System.out.print(n1 + " não é multiplo de 3");
		}

	}
}