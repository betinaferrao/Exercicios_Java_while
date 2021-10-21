package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex12 {
	public static void main(String[] args) {
		double notas = 0;
		double media = 0;
		int alunos = Integer.parseInt(JOptionPane.showInputDialog("Deseja inserir quantos alunos? "));
		int i = 1;
		while(i <= alunos) {
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "� aluno: ");
			double provas = Double.parseDouble(JOptionPane.showInputDialog("Quantas provas o aluno " + i + " fez? "));
			for(int j=1; j<=provas; j++) {
				double nota = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da prova " + j + " do " + i + " aluno?"));
				notas += nota;
			}
			media = notas/provas;
			JOptionPane.showMessageDialog(null, "M�dia do aluno " + nome + ": " + media);
			notas = 0;
			i++;
		}
	}
}

/*Fa�a um algoritmo para ler o nome de uma quantidade indefinida de alunos (utilize cart�o bandeira). 
Considere  que  cada  aluno  fez  uma  quantidade  (X)  de  provas,  onde  cada  aluno  poder�  ter  feito  um 
n�mero diferente de provas, isto �, o valor (X) pode ser diferente entre os alunos. Mostre no final a 
m�dia geral obtida por toda a turma. Pe�a para o usu�rio digitar o valor (X) de cada aluno. */