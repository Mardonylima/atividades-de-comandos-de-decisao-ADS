//Questão 03. leia dois números e efetue a adição. Caso o valor somado seja maior que
// 20, este deverá ser apresentado somando-se a ele mais 8; caso o valor somado seja
// menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.

package projetojava;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("informe um valor: ");
		int valor1 = entrada.nextInt();

		System.out.println("informe mais um valor: ");
		int valor2 = entrada.nextInt();

		int soma = valor1 + valor2;
		int soma1 = soma + 8;
		int subtrair = soma - 5;

		if (soma >= 20) {
			System.out.print("a soma dos valores foi " + soma + " e foi adicionado mais 8, ficando: " + soma1);
		} else if (soma <= 19) {
			System.out.print("a soma deu menor que 20 então foi por subtraindo-se 5, ficando: " + subtrair);
		}
	}
}
