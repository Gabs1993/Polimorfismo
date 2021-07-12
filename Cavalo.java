package Gabriel;

public class Cavalo extends Animal {
	
	private String Altura;
	private String cor;
	
	
	
	public Cavalo (String Nome, String Raça, String Tamanho, String Altura, String cor)
	{
		super(Nome, Raça, Tamanho);
		this.Altura = Altura;
		this.cor = cor;
				
	}
	@Override
	public void emitirsom(String som)
	{
		System.out.println("Relinchandoooooooooooooo..");
	}
	@Override
	public void locomover(String correr)
	{
		System.out.println("Cavalgandooooooooooooo");
	}


	public String getAltura() {
		return Altura;
	}




	public void setAltura(String altura) {
		Altura = altura;
	}




	public String getCor() {
		return cor;
	}




	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public void ImprimirDados()
	{
		System.out.println("\nO Nome do cavalo é  " +getNome()+ " com o tamanho :" +getTamanho()+ " com a " +Altura+ " cor: "+cor );
	}
	
	

}
