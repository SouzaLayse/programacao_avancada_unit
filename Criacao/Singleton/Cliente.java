//

package Singleton;

public class Cliente {

    public static void main(String[] args) {
                
    FabricaDeCarro fabrica = FabricaDeCarro.getInstancia();
    
    fabrica.criarCarroFiat();
    fabrica.criarCarroFord();
    fabrica.criarCarroVolks();
    
    fabrica.criarCarroFiat();
    fabrica.criarCarroFord();
    fabrica.criarCarroVolks();
    
    fabrica.gerarRelatorio();
    
    System.out.println(FabricaDeCarro.getInstancia().gerarRelatorio());
        
    }
    
}
