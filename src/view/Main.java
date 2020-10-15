package view;

import javax.swing.JOptionPane;

import controller.FilaEncadeada;
import controller.FilaEstatica;

public class Main {

	public static void main(String[] args) {
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
					+ "1- Estatica \n"
					+ "2- Dinamica \n"
					+ "9- Sair \n"
					+ "Digite sua opc:"));
			switch(opc) {
				case 1: menuEstatica();
					break;
				case 2: menuEncadeada();
					break;
				case 9: System.out.println("Bye bye");
					break;
				default: System.err.println("Opc invalida");
			}
		}
	}
	
	public static void menuEncadeada() {
		FilaEncadeada fila = new FilaEncadeada();
		int opc =0;
		while(opc!=9){
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu \n	  "
					+ "1- Enfileirar \n"
					+ "2- Desenfileirar \n"
					+ "3- Cabeça \n"
					+ "4- Cauda \n"
					+ "9- Sair \n"
					+ "Digite sua opc:"));
			switch(opc){
			case 1: fila.enfileirar(JOptionPane.showInputDialog("Insira o nome do aluno"));
			    break;
			case 2: fila.desenfileirar();
			    break;
			case 3: System.out.println(fila.cabeca());
			    break;
			case 4: System.out.println(fila.cauda());
			    break;
			case 9: System.out.println("Bye bye");
			    break;
			default: System.err.println("opc inválida");
			
			}
					
			
		}
	}
	
	public static void menuEstatica() {
		FilaEstatica fila = new FilaEstatica();
		int opc = 0;
		while(opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Menu\n"
					+ "1- Enfileirar \n"
					+ "2- Desenfileirar \n"
					+ "3- Cabeça \n"
					+ "4- Cauda \n"
					+ "9- Sair \n"
					+ "Digite sua opc:"));
			switch(opc) {
				case 1: fila.enfileirar(JOptionPane.showInputDialog("Insira o nome do aluno:"));
					break;
				case 2: fila.desenfileirar();
					break;
				case 3: System.out.println(fila.cabeca());
					break;
				case 4: System.out.println(fila.cauda());
					break;
				case 9: System.out.println("Bye bye");
					break;
				default: System.err.println("Opc invalida");
			}
		}
	}

}
