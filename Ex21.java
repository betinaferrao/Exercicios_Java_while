package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex21 {
	public static void main(String[] args) {
		char continua = 'S';
		String semEspaco = "";
		while (continua == 'S') {
			String palavra = JOptionPane.showInputDialog("Digite uma frase: ").toLowerCase();
			semEspaco = palavra.replace(" ", "");
			
			JOptionPane.showMessageDialog(null, semEspaco);
			continua = JOptionPane.showInputDialog("Deseja digitar mais uma palavra(S/N)? ").toUpperCase().charAt(0);
		}

	}
}

//Fa�a um algoritmo/programa que leia uma sequ�ncia de caracteres qualquer informada pelo usu�rio, 
//fa�a um algoritmo/programa que retire qualquer ocorr�ncia do caracter espa�o em branco.