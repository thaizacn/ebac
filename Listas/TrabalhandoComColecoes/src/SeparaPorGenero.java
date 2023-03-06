import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class SeparaPorGenero {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> entradaTeclado = null;
        List<String> generoMasculino = new ArrayList<>();
        List<String> generoFeminino = new ArrayList<>();

        System.out.println("Digite os dados <nome - genero> separados por vírgula:");
        String entrada = scanner.nextLine();

        entradaTeclado = Arrays.asList(entrada.replaceAll("\\s+","").split(","));


        for (String nome : entradaTeclado) {
            if (nome.trim().toLowerCase(Locale.ROOT).contains("-m")) {
            	generoMasculino.add(nome);
            } else {
            	generoFeminino.add(nome);
            }
        }

        System.out.println("HOMENS:");
        for (String h: generoMasculino) {
            System.out.println(h);
        }

        System.out.println();
        System.out.println("MULHERES:");
        for (String m: generoFeminino) {
            System.out.println(m);
        }
        System.out.println("-----------------------");
    }

}
