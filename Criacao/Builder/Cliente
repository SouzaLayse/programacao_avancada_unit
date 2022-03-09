// vai lidar apenas com a class ConcessionariaDirector, 
// toda a estrutura e algoritmos utilizados para construir o carro 

package Builder;

public class Cliente {

    public static void main(String[] args) {
                
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
	 
	concessionaria.construirCarro();
        
	CarroProduct carro = concessionaria.getCarro();
	    
        System.out.println("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao + "\nMotor:  " + carro.dscMotor + "\nValor: " + carro.preco + "\n");
	 
	concessionaria = new ConcessionariaDirector(new VolksBuilder());
	concessionaria.construirCarro();
	carro = concessionaria.getCarro();
	System.out.println("Carro: " + carro.modelo + "/" + carro.montadora + "\nAno: " + carro.anoDeFabricacao + "\nMotor: " + carro.dscMotor + "\nValor: " + carro.preco + "\n");
    }
    
}
