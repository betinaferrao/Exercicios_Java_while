package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex09 {
	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		double soma = 0;
		String medias = "";
		int aprovado = 0;
		int reprovado = 0;
		int recupera��o = 0;
		char continua = 'S';
		while (continua == 'S') {
			i++;
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "� aluno: ");
			int notas = Integer.parseInt(JOptionPane.showInputDialog("Quantas provas o aluno fez? "));
			while (j <= notas) {
				double nota = Double
						.parseDouble(JOptionPane.showInputDialog("Digite a " + j + "� nota do " + i + "� aluno: "));
				soma += nota;
				j++;
			}
			double media = soma / notas;
			if (media >= 7) {
				aprovado++;
			} else if (media < 2) {
				reprovado++;
			} else {
				recupera��o++;
			}
			medias += "M�dia de " + nome + ": " + media + "\n";
			j = 1;
			notas = 0;
			continua = JOptionPane.showInputDialog("Deseja cadastrar mais um aluno(S/N)? ").toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null,
				medias + "Quantidade de alunos aprovados: " + aprovado + "\nQuantidade de alunos reprovados: " + reprovado + "\nQuantidade de alunos em recupera��o: " + recupera��o);

	}
}

/*
 * Fa�a um algoritmo que leia uma rela��o de N alunos (utilize cart�o bandeira),
 * cada um possuindo a mesma quantidade Q de notas, fa�a um algoritmo/programa
 * que mostre: a) Nome e m�dia de cada aluno. b) Quantidade de alunos aprovados
 * (m�dia para aprova��o: >= 7.0). c) Quantidade de alunos reprovados (m�dia
 * para reprova��o: < 2.0). d) Quantidade de alunos em recupera��o.
 */