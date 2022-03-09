// interface comum para todos os objetos que constroem outros objetos
// método para construir cada um dos dados

package Builder;

public abstract class CarroBuilder {
    
    protected CarroProduct carro = new CarroProduct();
    
    public abstract void buildPreco();
    
    public abstract void buildDscMotor();
    
    public abstract void buildAnoDeFabricacao();
    
    public abstract void buildModelo();
    
    public abstract void buildMontadora();
    
    public CarroProduct getCarro(){
	return carro;
    };
    
}
