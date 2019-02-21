package colecoes;

import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoComportado {

	public static void main(String[] args) {
		//Set<String> aprovados = new HashSet<>(); //desordenado
		Set<String> aprovados = new LinkedHashSet<>(); //ordem de inserção
		//Set<String> aprovados = new TreeSet<>(); //ordenado alfabética ou numérica
		
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for(String nome: aprovados) {
			System.out.println(nome);
		}
	}
}
