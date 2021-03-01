package cadastros;

public class Pessoa extends Cadastro {

	private String sobrenome;
	
	
	
	//Get e Set
	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	
	//Construtores

	public Pessoa(String nome, String sobrenome ) {
		setNome(nome);
		setSobrenome(sobrenome);		
	}
	
}
