package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex19 {
	public static void main(String[] args) {
		char continua = 'S';
		String palavraCerta = "";
		while (continua == 'S') {
			String palavra = JOptionPane.showInputDialog("Digite uma frase: ");
			char c = palavra.charAt(palavra.length() - 1);
				if (c != '.') {
					palavraCerta = palavra + '.';
				}
			
			JOptionPane.showMessageDialog(null, palavraCerta);
			continua = JOptionPane.showInputDialog("Deseja digitar mais uma palavra(S/N)? ").toUpperCase().charAt(0);
			}
	}
}

// Faça um algoritmo que adicione ao final de um literal lido um ponto(.) caso não haja. Mostre ao final 
//o novo literal. 