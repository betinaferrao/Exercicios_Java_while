package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex15 {
	public static void main(String[] args) {
		char continua = 'S';
		while (continua == 'S') {
			String data = JOptionPane.showInputDialog("Digite uma data: ");
			String[] array = data.split("/");
			String n1 = array[0];
			String n2 = array[1];
			String n3 = array[2];
			
			 String junto = n2 + "\\" + n1 + "\\" + n3;
			 JOptionPane.showMessageDialog(null, "Data: " + junto);
			continua = JOptionPane.showInputDialog("Deseja continuar(S/N)? ").toUpperCase().charAt(0);
		}
	}
}

// Fa�a um programa que solicite ao usu�rio a data do dia na forma DD/MM/AA. Imprima a data na tela 
//utilizando uma �nica vari�vel no seguinte formato: AA/MM/DD. 