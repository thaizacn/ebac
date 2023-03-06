package br.com.thaizacn.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;


public class AppTabela {

	public static void main(String[] args)  {
		try {
			executeConstructor();
		} catch (NoSuchMethodException e) {
			System.out.println("Error: " + e);
		} catch (SecurityException e) {
			System.out.println("Error: " + e);
		}
	}

	private static void executeLeituraAnotacao() {
		System.out.println("--- Annotations ---");
		System.out.println("");
		
		
		Class tabela = Tabela.class;
		System.out.println("name class: " + tabela);
		System.out.println("");
		
		Tabela tabela1 = new Tabela();
		
		 
		if (tabela1.getClass().isAnnotationPresent(NomeTabela.class)) {
			NomeTabela nt = tabela1.getClass().getAnnotation(NomeTabela.class);
			System.out.println("name annotation: " + nt.getClass().getName());
			System.out.println("value annotation: " + nt.value());
		}
	

	}

	private static void executeFields() {
		System.out.println("--- Properties ---");
		System.out.println("");
		Tabela tabela = new Tabela();
		Field[] fields = tabela.getClass().getDeclaredFields();
		
		for (Field field : fields) {
			System.out.println("full name: " + field);
			System.out.println("simple name: " + field.getName());
			System.out.println("property type: " + field.getType());
			System.out.println();
		}
		
	
	}
	
	private static void executeConstructor() throws NoSuchMethodException, SecurityException {
		System.out.println("--- Constructor ---");
		System.out.println("");
		
		Class tabela1 = Tabela.class;
		Constructor con = tabela1.getConstructor();
		System.out.println("Constructor empty:" + con);
		System.out.println("");
	}
	

}