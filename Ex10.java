package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex10 {
	public static void main(String[] args) {
		int i = 0;
		char continua = 'S';
		while (continua == 'S') {
			i++;
			String nome = JOptionPane.showInputDialog("Digite o nome do " + i + "° funcionário: ");
			double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do " + i + "° funcionário: "));
			if (salario < 1000) {
				salario += (0.4 * salario);
			} else if (salario > 1000 && salario < 3000) {
				salario += (0.3 * salario);
			} else if (salario > 3000) {
				salario += (0.2 * salario);
			}
			JOptionPane.showMessageDialog(null, nome + " tem como salário: " + salario);
			continua = JOptionPane.showInputDialog("Deseja cadastrar mais um aluno(S/N)? ").toUpperCase().charAt(0);
		}
	}
}

/*
 * Escreva um algoritmo para calcular o reajuste salarial de uma empresa que
 * possui vários funcionários, cada um possuindo nome e salário (utilize cartão
 * bandeira), de acordo com os seguintes critérios: a) Os funcionários com
 * salário inferior a 1.000,00 devem ter um reajuste de 40%; b) Os funcionários
 * com salário entre 1.000,00 (inclusive) e 3.000,00 (inclusive) devem ter um
 * reajuste de 30%; c) Os funcionários com salário superior a 3.000,00 devem ter
 * um reajuste de 20%.
 */