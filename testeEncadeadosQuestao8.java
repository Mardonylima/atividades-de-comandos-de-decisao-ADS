//Questão 08. Faça um algoritmo que receba um número e diga se este número está no
// intervalo entre 100 e 200.

package projetojava;

public class testeEncadeadosQuestao8 {

	public static void main(String[] args) {

		int a = 100;

		if (a > 100) {
			if (a < 200) {
				System.out.println("o valor esta entre 100 e 200!!");
			} else {
				System.out.println("o valor nao esta entre 100 e 200!!");
			}
		} else {
			System.out.println("o valor é menor que 100!!!");
		}
	}
}