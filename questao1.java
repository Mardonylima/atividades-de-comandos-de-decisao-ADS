//Questão 01.Escrever um algoritmo que leia a idade da pessoa e imprima a mensagem
// “Voce é maior de idade “, caso ela tenha 18 ou mais, ou “você é menor de idade”,
// caso contrário.

package projetojava;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("qual a sua idade?");
		int idade = entrada.nextInt();

		if (idade >= 18) {
			System.out.print("você é maior de idade !!!");
		} else {
			System.out.print("você é menor de idade");
		}

	}

}
