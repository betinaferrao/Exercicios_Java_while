package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex06 {
	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos alunos?"));
		double maior = 0;
		String nomeMaior = "";
		int i = 1;

		while (i <= n) {
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "� aluno: ");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a m�dia do " + i + "� aluno: "));

			if (i == 1) {
				maior = media;
				nomeMaior = nome;
			} else if (media > maior) {
				maior = media;
				nomeMaior = nome;
			}
			i++;
		}

		JOptionPane.showMessageDialog(null, nomeMaior + " possui a maior m�dia, com " + maior);
	}
}

/*
 * Fa�a um algoritmo para ler o nome e a m�dia de N alunos. Ap�s a leitura,
 * mostre na tela o nome e m�dia do aluno com a maior m�dia. Considere que as
 * m�dias sejam todas diferentes entre si. Primeiro, utilize a estrutura de
 * repeti��o enquanto, depois a estrutura de repeti��o repita.
 */