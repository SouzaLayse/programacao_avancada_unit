////classe concreta para criar carros

package FactoryMethod;

public class FabricaWolks implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Gol();
	}
    
}
