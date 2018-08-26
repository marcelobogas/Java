package colecoes;

//Crtl + Shift + letra O para importar bibliotecas

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.offer("Maria"); //offer se não adicionar o elemento retorna = false
		fila.offer("João");
		fila.add("Pedro");
		
		System.out.println("Peek/Element..."); //Peek = retorna null, Element = retorna um erro
		System.out.println(fila.peek());
		System.out.println(fila.element());
		
		System.out.println("Pool/Remove..."); //poll = retorna null, remove = retorna um erro
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
