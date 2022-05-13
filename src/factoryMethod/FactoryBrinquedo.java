package factoryMethod;

public class FactoryBrinquedo {
	
	public Brinquedo getBrinquedo(String tipo, int preco) {
		if(tipo.equalsIgnoreCase("bola")) {
			return new Bola(preco);
		}
		
		if(tipo.equalsIgnoreCase("boneca")) {
			return new Boneca(preco);
		}
		
		if(tipo.equalsIgnoreCase("carrinho")) {
			return new Carrinho(preco);
		}
		
		System.out.println("Nao temos esse tipo de brinquedo!");
		return null;
	}
}
