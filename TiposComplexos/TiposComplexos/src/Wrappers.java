import java.util.Scanner;

public class Wrappers {
	
	public static void main(String[] args) {

		Scanner valores = new Scanner(System.in);
		System.out.println("Digite um valor num�rico: ");
		int valorPrimitivo = valores.nextInt();
		Integer valorWrapper = valorPrimitivo;
		System.out.println(valorWrapper);
		
	}
}
