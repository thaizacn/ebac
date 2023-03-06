import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrganizaListaPorGenero {
	
	public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        List<PessoasEGenero> listFemale = new ArrayList<>();
        List<PessoasEGenero> listMale = new ArrayList<>();

        System.out.println("Por favor, insira seu nome: ");
        String nome = f.next();
        System.out.println("Por favor, insira seu gênero: ");
        PessoasEGenero sexo = new PessoasEGenero(nome, f.next());
        if (sexo.getGenero().equalsIgnoreCase("Feminino")) {
            listFemale.add(sexo);
        } else {
            listMale.add(sexo);
        }
        
        System.out.println("Lista de mulheres: " + listFemale + "\n");
        System.out.println("Lista de homens: " + listMale);
    }

}
