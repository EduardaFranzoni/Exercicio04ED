package controller;

import interfaces.FIFO;

public class FilaEstatica implements FIFO{
	private int size;
	private String [] fila;
	
	public FilaEstatica() {
		this.fila = new String[5];
		size = 0;
	}

	@Override
	public void enfileirar(String data) {
		if(cheia()) {
			System.err.println("Fila cheia");
		}else {
			fila[size] = data;
			size++;
		}
	}

	@Override
	public void desenfileirar() {
		if(vazia()) {
			System.err.println("Fila vazia");
		}else {
			for(int i = 0; i < size - 1; i++) {
				fila[i] = fila[i+1];
			}
			size--;
		}
	}

	@Override
	public String cabeca() {
		if(vazia()) {
			return "Fila vazia";
		}else {
			return fila[0];
		}
	}

	@Override
	public String cauda() {
		if(vazia()) {
			return "Fila vazia";
		}else {
			return fila[size - 1];
		}
	}
	
	private boolean cheia() {
		return this.size == this.fila.length;
	}
	
	private boolean vazia() {
		return this.size == 0;
	}

}
