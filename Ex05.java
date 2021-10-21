package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex05 {
	public static void main(String[] args) {
		int func = Integer.parseInt(JOptionPane.showInputDialog("A empresa tem quantos funcionário? "));
		int i = 1;
		double soma = 0;
		
		while (i <= func) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do " + i + "° funcionário: "));
		soma += salario;
		i++;
		}
		
		double media = soma/(i-1);
		JOptionPane.showMessageDialog(null, "Média do salário dos " + func + " funcionários: " + media);

	}
}

/*
 * Uma empresa que possui X funcionários precisa saber a média de seus salários.
 * Faça um algoritmo para ler a quantidade de funcionários e o salário de cada
 * um e escrever a média dos salários. Primeiro, utilize a estrutura de
 * repetição enquanto, depois a estrutura de repetição repita.
 */