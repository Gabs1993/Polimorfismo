package Gabriel;

public abstract class Animal {
	
	private String Nome;
	private String Ra�a;
	private String Tamanho; 
	
	abstract void emitirsom(String som);
	abstract void locomover(String Correr);
		
	
	
	public Animal (String Nome, String Ra�a, String Tamanho)
	{
		this.Nome = Nome;
		this.Ra�a = Ra�a;
		this.Tamanho = Tamanho;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getRa�a() {
		return Ra�a;
	}


	public void setRa�a(String ra�a) {
		Ra�a = ra�a;
	}


	public String getTamanho() {
		return Tamanho;
	}


	public void setTamanho(String tamanho) {
		Tamanho = tamanho;
	}	
	
	public void StatusCachorro() {
		

	}
	
	
}
	
	
			
	
	
		
	
		
	
	
	
