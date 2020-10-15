package controller;

import interfaces.FIFO;
import model.Node;

public class FilaEncadeada implements FIFO{
	private Node start;
	
	public FilaEncadeada() {
		this.start = null;
	}

	@Override
	public void enfileirar(String data) {
		Node n = new Node(data);
		if(this.start == null) {
			this.start = n;
		}else {
			Node aux = this.start;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			aux.setNext(n);
		}
	}

	@Override
	public void desenfileirar() {
		if(this.start==null) {
			System.err.println("Fila vazia!");
		}else {
			this.start = this.start.getNext();
		}
	}

	@Override
	public String cabeca() {
		if(this.start == null) {
			return "Fila vazia";
		}else {
			return this.start.getData();
		}
	}

	@Override
	public String cauda() {
		if(this.start == null) {
			return "Fila Vazia";
		}else {
			Node aux = this.start;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			return aux.getData();
		}
	}

	
}
