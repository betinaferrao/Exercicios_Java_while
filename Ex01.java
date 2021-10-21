package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex01 {
	public static void main(String[] args) {
		int totalIdadeM = 0;
		int totalIdadeH = 0;
		int qntdMulher = 0;
		int qntdHomem = 0;
		double mediaM = 0;
		double mediaH = 0;
		char continua = 'S';
		
		while(continua == 'S') {
			JOptionPane.showInputDialog("Digite o nome do aluno: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: "));
			char sexo = JOptionPane.showInputDialog("Digite o sexo do aluno(F/M): ").toUpperCase().charAt(0);
			if (sexo == 'F') {
				qntdMulher ++;
				totalIdadeM += idade;

			} else if (sexo == 'M') {
				qntdHomem ++;
				totalIdadeH += idade;
			}
			
			continua = JOptionPane.showInputDialog("Deseja continuar(S/N)? ").toUpperCase().charAt(0);
			
		}
		mediaM = (totalIdadeM * 1.0)/qntdMulher;
		mediaH = (totalIdadeH * 1.0)/qntdHomem;
		
		JOptionPane.showMessageDialog(null, "Média da idade dos " + qntdHomem + " homens: " + mediaH +
				"\nMédia da idade das " + qntdMulher + " mulheres: " + mediaM);

	}
}

/*
 * 1) Faça um algoritmo para ler o nome, idade e sexo de um número indeterminado
 * de alunos. Ao final escreva a média da idade dos homens e das mulheres lidos.
 * Primeiro, utilize a estrutura de repetição enquanto, depois a estrutura de
 * repetição repita.
 */