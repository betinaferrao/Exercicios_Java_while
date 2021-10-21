package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex03 {
	public static void main(String[] args) {
		char continua = 'S';
		double exp = 1;
		
		while(continua == 'S') {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		for (int i=1; i<=n2; i++) {
			exp *= n1;
		}

		JOptionPane.showMessageDialog(null, "O resultado de " + n1 + " elevado na " + n2 + " é: " + exp);
		continua = JOptionPane.showInputDialog("Deseja continuar(S/N)? ").toUpperCase().charAt(0);
		}
		

	}
}

/*Faça um algoritmo que peça para o usuário digitar dois valores inteiros positivos, digamos A e B. Após 
calcule “A elevado ao expoente B”.  Primeiro,  utilize  a  estrutura  de  repetição  enquanto,  depois  a 
estrutura de repetição repita.*/