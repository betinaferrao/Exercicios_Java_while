package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex05 {
	public static void main(String[] args) {
		int func = Integer.parseInt(JOptionPane.showInputDialog("A empresa tem quantos funcion�rio? "));
		int i = 1;
		double soma = 0;
		
		while (i <= func) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Sal�rio do " + i + "� funcion�rio: "));
		soma += salario;
		i++;
		}
		
		double media = soma/(i-1);
		JOptionPane.showMessageDialog(null, "M�dia do sal�rio dos " + func + " funcion�rios: " + media);

	}
}

/*
 * Uma empresa que possui X funcion�rios precisa saber a m�dia de seus sal�rios.
 * Fa�a um algoritmo para ler a quantidade de funcion�rios e o sal�rio de cada
 * um e escrever a m�dia dos sal�rios. Primeiro, utilize a estrutura de
 * repeti��o enquanto, depois a estrutura de repeti��o repita.
 */