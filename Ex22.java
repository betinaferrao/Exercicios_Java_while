package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex22 {
	public static void main(String[] args) {
		char continua = 'S';
		String semEspaco = "";
		while (continua == 'S') {
			String palavra = JOptionPane.showInputDialog("Digite uma frase: ").toLowerCase();
			semEspaco = palavra.replace(" ", ".");
			
			JOptionPane.showMessageDialog(null, semEspaco);
			continua = JOptionPane.showInputDialog("Deseja digitar mais uma palavra(S/N)? ").toUpperCase().charAt(0);
		}

	}
}

/*
 * Faça um algoritmo/programa que leia uma sequência de caracteres qualquer
 * informada pelo usuário, faça um algoritmo/programa que troque qualquer
 * ocorrência do caracter espaço em branco por um ponto (.).
 */
