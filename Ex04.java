package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex04 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo qualquer: "));
		int i = 0;
		int fat = 1;
		
		while(n > i) {
			fat *= n;
			n--;
		}
		
		
		JOptionPane.showMessageDialog(null, "O fatorial de " + n + " é " + fat);
	}
}

/*
 * Peça para o usuário digitar um número inteiro positivo qualquer, digamos N.
 * Após calcule N! Primeiro, utilize a estrutura de repetição enquanto, depois a
 * estrutura de repetição repita.
 */

//ERROOOOOOOOOOO