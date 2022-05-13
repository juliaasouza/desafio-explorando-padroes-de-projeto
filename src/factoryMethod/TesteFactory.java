package factoryMethod;

public class TesteFactory {

	public static void main(String[] args) {
		FactoryBrinquedo factory = new FactoryBrinquedo();
		System.out.println(factory.getBrinquedo("bola", 10));		//usei o sysout pra poder ver que os
		System.out.println(factory.getBrinquedo("boneca", 15));		// objetos foram instanciados
		System.out.println(factory.getBrinquedo("carrinho", 12));
		System.out.println(factory.getBrinquedo("pelucia", 20));

	}

}
