package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex20 {
	public static void main(String[] args) {
		String palindromo = "";
		String palavra = JOptionPane.showInputDialog("Digite uma frase: ");
		for (int i = palavra.length() - 1; i >= 0 ; i-- ) {
			palindromo += palavra.charAt(i);
			}
		
		if (palindromo.equals(palavra)) {
			JOptionPane.showMessageDialog(null, "É um palíndromo!");
		} else {
			JOptionPane.showMessageDialog(null, "Não é um palíndromo!");
		}
	}
}


/*
 * Faça um algoritmo/programa que leia uma sequência de caracteres qualquer
 * informada pelo usuário, faça um algoritmo/programa que mostre no vídeo uma
 * mensagem informando ao usuário se a palavra digitada é palíndrome ou não.
 * Obs; uma palavra é palíndrome quando lida de trás para frente fica igual a
 * original, exemplos: ASA, MIRIM.
 */
