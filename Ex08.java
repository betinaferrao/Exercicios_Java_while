package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex08 {
	public static void main(String[] args) {
		int i = 0;
		char continua = 'S';
		while (continua == 'S') {
			i++;
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "° aluno: ");
			double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1° nota do " + i + "° aluno: "));
			double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2° nota do " + i + "° aluno: "));
			double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3° nota do " + i + "° aluno: "));
			JOptionPane.showMessageDialog(null, nome + " tem como notas: " + nota1 + ", " + nota2 + ", " + nota3 );
			continua = JOptionPane.showInputDialog("Deseja cadastrar mais um aluno(S/N)? ").toUpperCase().charAt(0);
			
	}
  }
}


/*
 * Faça um algoritmo para ler o nome de uma quantidade indefinida de alunos,
 * usando cartão bandeira. Considere que cada aluno fez três provas, por isso
 * para cada aluno deverá ser digitado também, alem de seu nome, as suas três
 * notas
 */

