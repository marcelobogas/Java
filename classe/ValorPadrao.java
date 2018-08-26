package classe;

public class ValorPadrao {

	// Os 7 tipos primitivos tem seu valor por padr�o = 0 (Byte, Short, Int, Long, Float, Double, Char)
	// Somente o tipo Booleano tem seu valor por padr�o = true ou false
	
	static boolean a; // vari�veis de inst�ncia(global) s�o por padr�o inicializadas implicitamente por valor padr�o = 0
	
	public static void main(String[] args) {
		System.out.println(a);
		
		Object b = null;
		System.out.println(b); // vari�veis locais devem ser inicializadas com valores explicitos
	}
}
