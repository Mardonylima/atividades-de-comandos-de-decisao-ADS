//Questão 07. Construa um algoritmo que determine quanto será gasto para encher o
// tanque de um carro (VG), sabendo-se que o preço da gasolina é de R$ 3,79 e o preço
// do álcool é de R$ 2.90. O usuário fornecerá os seguintes dados: Tipo de Combustível
// (TC) (G – gasolina ou A – álcool) e Capacidade do tanque (CT), em litros.

package projetojava;

import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o tipo de combustível (G - gasolina ou A - álcool): ");
		String tipocombustivel = entrada.nextLine().toUpperCase();

		System.out.print("Informe a capacidade do tanque em litros: ");
		double capacidadetanque = entrada.nextDouble();

		double precolitro;
		if (tipocombustivel.equals("G")) {
			precolitro = 3.79;
		} else if (tipocombustivel.equals("A")) {
			precolitro = 2.90;
		} else {
			System.out.println("digite 'A' ou 'G' por favor ");
			return;
		}

		double valortotal = precolitro * capacidadetanque;
		System.out.println("O valor total gasto para encher o tanque será de R$ " + valortotal);
	}

}
