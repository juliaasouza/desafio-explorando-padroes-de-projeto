package factoryMethod;

public abstract class Brinquedo {
	int preco; 				// classe abstrata padrao que servira de base
	String tipo;			// para os produtos concretos
}

class Bola extends Brinquedo {
	
	public Bola(int preco) {
		this.preco = preco;
		System.out.println("Essa bola custa " + preco + " reais");
	}
	
}

class Boneca extends Brinquedo {
	
	public Boneca(int preco) {
		this.preco = preco;
		System.out.println("Essa boneca custa " + preco + " reais");
	}
	
}

class Carrinho extends Brinquedo {
	
	public Carrinho(int preco) {
		this.preco = preco;
		System.out.println("Esse carrinho custa " + preco + " reais");
	}
	
}