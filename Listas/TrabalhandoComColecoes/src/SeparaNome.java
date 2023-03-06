import java.util.Arrays;
import java.util.Scanner;

public class SeparaNome {
	
	public static void main(String[] args) throws Exception {
	       Scanner sc = new Scanner(System.in);
	       int i; 
	        System.out.println("Informe os nomes separados por vírgula. Ex: Maria, José, João");
	        String entrada = sc.next();
	        String[] vetor = entrada.split(",");

	        Arrays.sort(vetor);
	        for(i=0;i < vetor.length;i++){
	            System.out.print(vetor[i]);
	        }
	}
}
