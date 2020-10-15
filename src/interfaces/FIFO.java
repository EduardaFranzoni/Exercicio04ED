package interfaces;

public interface FIFO {
	public void enfileirar(String data);
	
	public void desenfileirar();
	
	public String cabeca();
	
	public String cauda();
}
