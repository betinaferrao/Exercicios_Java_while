package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex07 {
	public static void main(String[] args) {
		int n = 1;
		String num = "";
		
		while(n > 0) {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número maior que zero: "));
			if (n > 0) {
				num += n + ", ";
			}
		}

		JOptionPane.showMessageDialog(null, "Números digitados: " + num);
	}
}


/*Faça  um  algoritmo  onde  o  usuário  deverá  digitar  uma  série  de  números  inteiros  maiores  que  zero, 
usando cartão bandeira. */

//ERROOOOOO