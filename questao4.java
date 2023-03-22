//Questão 04. A FPB abriu uma linha de crédito para os funcionários. O valor máximo
// da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que
// permita entrar com o salário bruto e o valor da prestação, e informar se o
// empréstimo pode ou não ser concedido.

package projetojava;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("informe seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("qual o seu salario bruto: ");
		double salario = entrada.nextDouble();

		double calculo = (salario * 30) / 100;

		System.out.println("informe o valor da trestação: ");
		double prestaçao = entrada.nextDouble();

		if (calculo > prestaçao) {
			System.out.print(" liberado a prestação senhor(a) : " + nome);
		} else {
			System.out.print("não foi possivel liberar os creditos senhor(a) : " + nome);
		}
		entrada.close();
	}

}
