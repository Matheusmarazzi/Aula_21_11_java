package Exercicio;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {

		ArrayList<String> estudantes;
		estudantes = new ArrayList();
		
		// Parte 1

		estudantes.add("Amy");
		estudantes.add("Bob");
		estudantes.add("Cindy");
		estudantes.add("David");

		System.out.println(estudantes);
		System.out.println(estudantes.size());
		
		// Parte 2
		
		estudantes.add(0,"Nick");
		estudantes.add(1,"Mike");
		
		estudantes.remove(3);
		
		System.out.println(estudantes);
		System.out.println(estudantes.size());
	
	}

}
