//Questão 02. leia dois valores inteiro distintos e informe qual é o
// maior e o menor.

package projetojava;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("informe um valor: ");
		int valor1 = entrada.nextInt();

		System.out.println("informe mais um valor: ");
		int valor2 = entrada.nextInt();

		if (valor1 > valor2) {
			System.out.print(valor1 + " o primeiro valor é maior que o segundo " + valor2);
		} else {
			System.out.print(valor2 + " o segundo valor é maior que o primeiro " + valor1);
		}
		entrada.close();

	}

}
