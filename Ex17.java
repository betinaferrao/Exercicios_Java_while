package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex17 {
	public static void main(String[] args) {
		char continua = 'S';
		int contarEspaco = 0;
		while (continua == 'S') {
			String palavra = JOptionPane.showInputDialog("Digite uma frase: ").toLowerCase();
			for (int i = 0; i < palavra.length(); i++){
				char c = palavra.charAt(i);
				if (c == ' ') {
					contarEspaco++;
				}
			}
			JOptionPane.showMessageDialog(null, "N�mero de espa�os na frase: " + contarEspaco);
			contarEspaco = 0;
			continua = JOptionPane.showInputDialog("Deseja digitar mais uma palavra(S/N)? ").toUpperCase().charAt(0);
		}
	}
}

//Fa�a um algoritmo onde o usu�rio dever� digitar uma frase qualquer. Ap�s a leitura, mostre na tela a 
//quantidade de caracteres �espa�o em branco� existente na frase. 

//ERRO