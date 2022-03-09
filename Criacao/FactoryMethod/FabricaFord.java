////classe concreta para criar carros

package FactoryMethod;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Fiesta();
	}
    
}
