package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex11 {
	public static void main(String[] args) {
		int totalIdadeM = 0;
		int totalIdadeH = 0;
		int qntdMulher = 0;
		int qntdHomem = 0;
		double mediaM = 0;
		double mediaH = 0;
		double mais18 = 0;
		double total18 = 0;
		double media18 = 0;
		int i = 0;
		char continua = 'S';
		
		while(continua == 'S') {
			i++;
			JOptionPane.showInputDialog("Digite o nome do " + i + "� funcion�rio: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcion�rio: "));
			char sexo = JOptionPane.showInputDialog("Digite o sexo do funcion�rio(F/M): ").toUpperCase().charAt(0);
			if (sexo == 'F') {
				qntdMulher ++;
				totalIdadeM += idade;

			} else if (sexo == 'M') {
				qntdHomem ++;
				totalIdadeH += idade;
			}
			
			if(idade>18) {
				mais18 ++;
				total18 += idade;
			}
			
			continua = JOptionPane.showInputDialog("Deseja cadastrar mais um funcion�rio(S/N)? ").toUpperCase().charAt(0);
			
		}
		mediaM = totalIdadeM/qntdMulher;
		mediaH = totalIdadeH/qntdHomem;
		media18 = total18/mais18;
		
		JOptionPane.showMessageDialog(null, "M�dia da idade dos " + qntdHomem + " homem(s): " + mediaH +
				"\nM�dia da idade das " + qntdMulher + " mulher(es): " + mediaM + "\nM�dia da idade das pessoas com mais de 18 anos: " + media18);

	}
}


/* Uma  empresa  possui  uma  s�rie  de  N  funcion�rios  (utilize  cart�o  bandeira),  dos  quais  �  conhecido: 
nome, idade e sexo. Fa�a um algoritmo que imprima: 
a) A m�dia da idade dos homens; 
b) A m�dia da idade das mulheres; 
c) A m�dia da idade das pessoas com mais de 18 anos;*/