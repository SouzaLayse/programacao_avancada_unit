// define o valor de compra do carro (getters e setters)

// construtor protegido (cópia) -> recebe como parâmetro um objeto da própria classe protótipo, ou seja, 
// recebe um outro objeto da mesma classe e cria um novo objeto com os mesmos valores nos atributos

package Prototype;

public class PalioPrototype extends CarroPrototype {

	private PalioPrototype(PalioPrototype palioPrototype) {
		this.valorCompra = palioPrototype.getValorCompra();
	}

	public PalioPrototype() {
		valorCompra = 0.0;
	}

	@Override
	public String exibirInfo() {
		return "Modelo: Palio\n" + "Montadora: Fiat\n" + "Valor: R$" + getValorCompra() + "\n";
	}

	@Override
	public CarroPrototype clonar() {
		return new PalioPrototype(this);
	}
    
}
