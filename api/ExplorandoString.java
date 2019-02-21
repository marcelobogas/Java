package api;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = new String("Marcelo");
		nome = "Marcelo";
		
		// Métodos Importantes
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.indexOf('l'));
		System.out.println(nome.charAt(3));
		System.out.println(nome.equalsIgnoreCase("marcelo"));
		System.out.println(nome.startsWith("Mar"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" é legal!").concat("!"));
		
		// A String é imutável
		System.out.println(nome);
		
		nome = nome.toUpperCase().substring(0, 3).concat(" é legal!!");
		System.out.println(nome);
	}
}
