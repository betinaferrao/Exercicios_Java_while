package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex18 {
	public static void main(String[] args) {
		char continua = 'S';
		int i = 0;
		int contarVogais = 0;
		while (continua == 'S') {
			String palavra = JOptionPane.showInputDialog("Digite uma frase: ").toLowerCase();
			int texto = palavra.length();
			while (i < texto) {
				char c = palavra.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					contarVogais++;
				}
				i++;
			}
			JOptionPane.showMessageDialog(null, "N�mero de vogais na frase: " + contarVogais);
			contarVogais = 0;
			continua = JOptionPane.showInputDialog("Deseja digitar mais uma palavra(S/N)? ").toUpperCase().charAt(0);
		}
	}
}

//Fa�a um algoritmo/programa que leia uma sequ�ncia de caracteres qualquer informada pelo usu�rio, 
//fa�a um algoritmo/programa que mostre no v�deo a quantidade de vogais existentes. 
