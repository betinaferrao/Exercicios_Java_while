package aula_3_exercicios;

import javax.swing.JOptionPane;

public class ExercicioExemplo {
	public static void main(String[] args) {
		String menu = "1- Adição\n" +
				"2- Subtração\n" +
				"3 - Multiplicação\n" +
				"4- Divisão\n\n" +
				"5- Sair";
		
			double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1° número: "));
			double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2° número: "));
			
			int op = 0;
			while(op != 5) {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1) {
				JOptionPane.showMessageDialog(null, a + b);
			} else if (op == 2) {
				JOptionPane.showMessageDialog(null, a - b);
			} else if (op == 3) {
				JOptionPane.showMessageDialog(null, a * b);
			} else if (op == 4) {
				JOptionPane.showMessageDialog(null, a / b);
			}

		}
	}
}
