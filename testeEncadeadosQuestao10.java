//Questão 10. Escrever um algoritmo que leia o nome e as três notas obtidas por um
// aluno durante o semestre. Calcular a sua média (aritmética), informar o nome e sua
// menção aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media
// entre 5.1 a 6.9).

package projetojava;

import java.util.Scanner;

public class testeEncadeadosQuestao10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("informe seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("primeira nota: ");
		double n1 = entrada.nextDouble();

		System.out.println("segunda nota: ");
		double n2 = entrada.nextDouble();

		System.out.println("terceira nota: ");
		double n3 = entrada.nextDouble();

		double ntfinal = (n1 + n2 + n3) / 3;
		
		System.out.println("o aluno: "+nome+" tem a média: "+ntfinal);
		
		if (ntfinal >= 7) {
			System.out.println("aprovado!!!! ");
		} else {
			if (ntfinal >= 6.1) {
				System.out.println("recuperação, foi quase em ");
			} else if (ntfinal >= 5.1) {
				System.out.println("recuperação mofi tem que estudar mais");
			} else {
				System.out.println("reprovado");
			}
		}

		entrada.close();
	}
}
