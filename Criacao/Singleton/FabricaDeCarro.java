// Ao proteger o construtor evitamos que a classe 
// possa ser instanciada em qualquer outro lugar do código que não seja a própria classe

package Singleton;

public class FabricaDeCarro {
    

    public static FabricaDeCarro instancia; // referencia um objeto
    protected int totalCarrosFiat;
    protected int totalCarrosFord;
    protected int totalCarrosVolks;
 
    //construtor protegido
    protected FabricaDeCarro() {
    }
 
    // método para retornar a referência para a fábrica
    public static FabricaDeCarro getInstancia() {
        if (instancia == null)
            instancia = new FabricaDeCarro();
        return instancia;
    }
    
    public String criarCarroVolks() {
        return new String("Carro Volks " + totalCarrosVolks++ + " criado ");
    }
 
    public String criarCarroFord() {
        return new String("Carro Ford " + totalCarrosFord++ + " criado ");
    }
 
    public String criarCarroFiat() {
        return new String("Carro Fiat " + totalCarrosFiat++ + " criado ");
    }
 
    public String gerarRelatorio() {
        return new String("\n" + "Total de carros Fiat vendidos: " + totalCarrosFiat
                + "\nTotal de carros Ford vendidos: " + totalCarrosFord
                + "\nTotal de carros Volks vendidos: " + totalCarrosVolks + "\n");
    }
    
}
