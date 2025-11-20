public class DadosBancarios {
	private int numAgencia;
	private int numConta;
	private String nomeGerente;
	
	DadosBancarios(int numAgencia, int numConta, String nomeGerente){
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.nomeGerente = nomeGerente;
	}
	
	public int getNumAgencia() {
		return numAgencia;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getNomeGerente() {
		return nomeGerente;
	}
}
