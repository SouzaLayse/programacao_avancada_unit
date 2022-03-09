// são criamos dois protótipos de carros, cada um deles é criado utilizando o prótipo 
// PalioPrototype instanciado anteriormente, ou seja, a partir de uma instância 
// de um protótipo é possível criar vários objetos a partir da cópia deste protótipo

package Prototype;

public class Cliente {

    public static void main(String[] args) {
        
        PalioPrototype prototipoPalio = new PalioPrototype();

	CarroPrototype palioNovo = prototipoPalio.clonar();
	palioNovo.setValorCompra(27900.0);
	
        CarroPrototype palioUsado = prototipoPalio.clonar();
	palioUsado.setValorCompra(21000.0);

	System.out.println(palioNovo.exibirInfo());
	System.out.println(palioUsado.exibirInfo());
    }
    
}
