package br.com.ebac.projetogeladeira;

/**
 * 
 * @author thaizacn
 *
 */
public class Main {
	
	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        Geladeira novaGeladeira = new Geladeira();
        
        novaGeladeira.setCor("rosa-pink");
        novaGeladeira.setPorta(2);
        novaGeladeira.setModelo("Frost Free Inverse");
        novaGeladeira.setVoltagem(110);
        novaGeladeira.setMarca("Brastemp");
        novaGeladeira.setCodigo("GELADEIRAJAVEIRA01");
        
        
        System.out.println("Sua geladeira " + novaGeladeira.getCor() +
             					" , do modelo " + novaGeladeira.getModelo() +
             						" cujo código é: " + novaGeladeira.getCodigo() +
             							" está pronta! Para mais detalhes consulta vendedor!");
    }

}
