package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex07 {
	public static void main(String[] args) {
		int n = 1;
		String num = "";
		
		while(n > 0) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero maior que zero: "));
			if (n > 0) {
				num += n + ", ";
			}
		}

		JOptionPane.showMessageDialog(null, "N�meros digitados: " + num);
	}
}


/*Fa�a  um  algoritmo  onde  o  usu�rio  dever�  digitar  uma  s�rie  de  n�meros  inteiros  maiores  que  zero, 
usando cart�o bandeira. */

//ERROOOOOO