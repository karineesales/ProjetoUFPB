package BancoDeQuestoes;

public class Pessoa {
	private String nome;
	private String matricula;
	private String email;
	
	public Pessoa(String nome, String matricula, String email){
		this.nome= nome;
		this.matricula= matricula;
		this.email= email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nomes) {
		this.nome = nomes;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
