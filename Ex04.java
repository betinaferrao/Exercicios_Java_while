package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex04 {
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero positivo qualquer: "));
		int i = 0;
		int fat = 1;
		
		while(n > i) {
			fat *= n;
			n--;
		}
		
		
		JOptionPane.showMessageDialog(null, "O fatorial de " + n + " � " + fat);
	}
}

/*
 * Pe�a para o usu�rio digitar um n�mero inteiro positivo qualquer, digamos N.
 * Ap�s calcule N! Primeiro, utilize a estrutura de repeti��o enquanto, depois a
 * estrutura de repeti��o repita.
 */

//ERROOOOOOOOOOO