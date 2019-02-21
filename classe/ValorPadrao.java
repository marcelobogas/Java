package classe;

public class ValorPadrao {

	// Os 7 tipos primitivos tem seu valor por padrão = 0 (Byte, Short, Int, Long, Float, Double, Char)
	// Somente o tipo Booleano tem seu valor por padrão = true ou false
	
	static boolean a; // variáveis de instância(global) são por padrão inicializadas implicitamente por valor padrão = 0
	
	public static void main(String[] args) {
		System.out.println(a);
		
		Object b = null;
		System.out.println(b); // variáveis locais devem ser inicializadas com valores explicitos
	}
}
