package colecoes;

// Crtl + Shift + letra O para importar bibliotecas

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		//Stack<String> pilha = new Stack();
		Deque<String> pilha = new ArrayDeque<>();
		
		pilha.push("O pequeno principe");
		pilha.push("O Hobbit");
		pilha.push("Dom Quixote");
		
		System.out.println("Peek..."); //seleciona o primeiro item da pilha
		System.out.println(pilha.peek());
		
		System.out.println("Pop..."); //retira o primeiro item da pilha
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
	}
}
