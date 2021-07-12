package Gabriel;

public class TesteGeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro Thor = new Cachorro ("Thor","\nviralatinha","\nGrande","50","70");
		
		Thor.ImprimirDados();
		System.out.println("\n");
		Thor.emitirsom(null);
		Thor.locomover(null);
		
		Cavalo Pédepano = new Cavalo ("PédePano","\nMUSTANG","\nGRANDE", "\n2" ,"\npreto");
		
		Pédepano.ImprimirDados();
		System.out.println("\n");
		Pédepano.emitirsom(null);
		Pédepano.locomover(null);
		
		Preguiça Gabriel = new Preguiça ("Gabriel","\nDOIDO","\nGrande","\nRARA","\nsementes");
		
		Gabriel.ImprimirDados();
		System.out.println("\n");
		Gabriel.emitirsom(null);
		Gabriel.locomover(null);
		
		
	
		
	}

}
