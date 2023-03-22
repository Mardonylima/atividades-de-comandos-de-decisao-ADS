//Questão 05. Ler um número e informar se é par ou impar

package projetojava;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("informe um valor: ");
		int n1 = entrada.nextInt();

		if (n1 % 2 == 0) {
			System.out.print(n1 + " é par");
		} else {
			System.out.print(n1 + " é impar");
		}
		entrada.close();
	}
}
