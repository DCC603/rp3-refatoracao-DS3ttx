public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	
	Cliente(String nome, String cpf, String telefone){
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCPF() {
		return cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String toString() {
		return String.format("CPF: %s\nNome: %s\nTelefone: %s", this.cpf, this.nome, this.telefone);
	}
}
