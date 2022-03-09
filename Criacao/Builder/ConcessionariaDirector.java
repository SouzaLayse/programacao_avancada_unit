// utiliza a estrutura do Builder para definir o algoritmo de construção do Produto
// a classe vai executar os métodos de construção ->
// definindo assim o algoritmo de construção do carro, e depois devolve o carro

package Builder;

public class ConcessionariaDirector {
    
    protected CarroBuilder montadora;
	 
    public ConcessionariaDirector(CarroBuilder montadora) {
        this.montadora = montadora;
    }
 
    public void construirCarro() {
        montadora.buildPreco();
        montadora.buildAnoDeFabricacao();
        montadora.buildDscMotor();
        montadora.buildModelo();
        montadora.buildMontadora();
    }
 
    public CarroProduct getCarro() {
        return montadora.getCarro();
    }
    
}
