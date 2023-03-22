//Questão 09. Faça um algoritmo que leia dois números e identifique se são iguais ou
// diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que eles são
// iguais. Caso sejam diferentes, informe qual número é o maior, e uma mensagem
// que são diferentes.
package projetojava;

import java.util.Scanner;

public class testeEencadeadosQuestao9 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("informe o primeiro valor: ");
		int valor1 = entrada.nextInt();

		System.out.println("informe o segundo valor: ");
		int valor2 = entrada.nextInt();

		if (valor1 == valor2) {
			System.out.print(" o primeiro valor é igual o segundo valor ");
		} else if (valor1 > valor2) {
			System.out.print(" o primeiro valor é maior que o segundo valor ");
		} else if (valor2 > valor1) {
			System.out.print("o segundo valor é maior que o primeiro valor ");

		}
	}
}