// define o valor de compra do carro (getters e setters)

// construtor protegido (cópia) -> recebe como parâmetro um objeto da própria classe protótipo, ou seja, 
// recebe um outro objeto da mesma classe e cria um novo objeto com os mesmos valores nos atributos

package Prototype;

public class GolPrototype extends CarroPrototype {

	protected GolPrototype(GolPrototype golPrototype) {
		this.valorCompra = golPrototype.getValorCompra();
	}

	public GolPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: Gol\nMontadora: Wolkswagen\n" + "Valor: R$" + getValorCompra() + "\n";
	}

	@Override
	public CarroPrototype clonar() {
		return new GolPrototype(this);
	}
    
}
