//classe concreta para criar carros
package FactoryMethod;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Palio();
	}
    
}
