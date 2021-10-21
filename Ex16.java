package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex16 {
	public static void main(String[] args) {
		char continua = 'S';
		while (continua == 'S') {
			String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
			JOptionPane.showMessageDialog(null, "Tamanho da palavra: " + palavra.length());
			continua = JOptionPane.showInputDialog("Deseja digitar mais uma palavra(S/N)? ").toUpperCase().charAt(0);
		}
	}
}

// Faça  um  algoritmo/programa  que  leia  uma  quantidade  N  de  palavras,  após  cada  leitura  escreva  o 
//tamanho da mesma
