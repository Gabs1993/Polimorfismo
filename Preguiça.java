package Gabriel;

public class Preguiça extends Animal {
	
	private String Especie;
	private String Alimentação;
	

	public Preguiça (String Nome, String Raça, String Tamanho, String Especie, String Alimentação)
	{
		super(Nome,Raça,Tamanho);
		this.Especie = Especie;
		this.Alimentação = Alimentação;
	}
	@Override
	public void emitirsom(String som)
	{
		System.out.println("AAAAAAAAAAA");
	}
	@Override
	public void locomover(String Correr)
	{
		System.out.println("\nRasteijando");
		
	}


	public String getEspecie() {
		return Especie;
	}


	public void setEspecie(String especie) {
		Especie = especie;
	}


	public String getAlimentação() {
		return Alimentação;
	}


	public void setAlimentação(String alimentação) {
		Alimentação = alimentação;
	}
	
	public void ImprimirDados()
	{
		System.out.println("\nO nome é: " +getNome()+ " com o tamanho: " +getTamanho()+ "  e a especie: " +Especie+ " e ela(a) se alimenta de "+Alimentação);
	}
	
	
	
	

}
