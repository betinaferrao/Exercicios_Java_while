package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex02 {
	public static void main(String[] args) {
		char continua = 'S';
		int soma = 0;
		double media = 0;
		int qntd = 0;
		
		while(continua == 'S') {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		soma += n;
		qntd ++;
		continua = JOptionPane.showInputDialog("Deseja continuar(S/N)? ").toUpperCase().charAt(0);
		}
		
		media = (double) soma/qntd;
		JOptionPane.showMessageDialog(null, "A m�dia dos n�meros � " + media);
	}
}

/*
 * Fa�a um algoritmo para ler N n�meros inteiros e ao final escrever sua m�dia.
 * Primeiro, utilize a estrutura de repeti��o enquanto, depois a estrutura de
 * repeti��o repita.
 */