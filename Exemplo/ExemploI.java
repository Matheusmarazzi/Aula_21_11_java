package Exemplo;

import java.util.ArrayList;

public class ExemploI {

	public static void main(String[] args) {
		
		// ArrayList<String> states = new ArrayList<>(){;
		
		ArrayList<String> names;
		names = new ArrayList();
		
		names.add("Jamie");
		names.add("Gustav");
		names.add("Alisa");
		names.add("Jose");
		names.add(2,"Prashant"); // adiciona ao indice 2, "Prashant". Jamie, Gustav, Prashant, Alisa, ...
		
		String str = names.get(0); // imprime Jamie
		System.out.println(str);
	
		names.remove(0); // remove Jamie
		names.remove(names.size()-1); // Remove Jose 
		names.remove("Gustav");
		
		System.out.println(names);
		}
	}

}
