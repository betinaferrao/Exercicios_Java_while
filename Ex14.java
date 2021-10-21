package aula_3_exercicios;

import javax.swing.JOptionPane;

public class Ex14 {
	public static void main(String[] args) {
		char continua = 'S';
		while (continua == 'S') {
			String data = JOptionPane.showInputDialog("Digite uma data: ");
			String[] array = data.split("/");
			String dia = array[0];
			String mes = array[1];
			String ano = array[2];
			
			JOptionPane.showMessageDialog(null, "Dia: " + dia + "\nMês: " + mes + "\nAno: " + ano);
			continua = JOptionPane.showInputDialog("Deseja continuar(S/N)? ").toUpperCase().charAt(0);
		}
	}
}

//Faça um programa que leia um LITERAL em forma de data. Exemplo: “26/09/95” e escrever ao final o 
//dia, mês e ano desta data todos em mensagens separadas.
