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
			JOptionPane.showMessageDialog(null, "� um pal�ndromo!");
		} else {
			JOptionPane.showMessageDialog(null, "N�o � um pal�ndromo!");
		}
	}
}


/*
 * Fa�a um algoritmo/programa que leia uma sequ�ncia de caracteres qualquer
 * informada pelo usu�rio, fa�a um algoritmo/programa que mostre no v�deo uma
 * mensagem informando ao usu�rio se a palavra digitada � pal�ndrome ou n�o.
 * Obs; uma palavra � pal�ndrome quando lida de tr�s para frente fica igual a
 * original, exemplos: ASA, MIRIM.
 */
