/*
Cliente fica dependendo de interfaces simples e pequenas ao invés de depender 
de uma interface grande e que nem todos os métodos seria utilizados.
 */
package AbstractFactory;

public class Cliente {

    public static void main(String[] args) {
        
        FabricaDeCarro fabrica = new FabricaFiat();
	
        CarroSedan sedan = fabrica.criarCarroSedan();
	CarroPopular popular = fabrica.criarCarroPopular();
	sedan.exibirInfoSedan();
	System.out.println();
	popular.exibirInfoPopular();
	System.out.println();

	fabrica = new FabricaFord();
	sedan = fabrica.criarCarroSedan();
	popular = fabrica.criarCarroPopular();
	sedan.exibirInfoSedan();
	System.out.println();
	popular.exibirInfoPopular();
                
    }
    
}
