package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipo primitivo Booleano
		boolean bo1 = false;
		boolean bo2 = true;
		System.out.printf("%b %b - Tipo Booleano\n", bo1, bo2);
		
		// Tipo primitivo caractere
		char c1 = 'a';
		char c2 = '!';
		char c3 = '\u0050'; //código da tabela unicode
		System.out.printf("%c %c %c - Tipo Caracter\n", c1, c2, c3);
		
		// Tipos primitivos inteiros
		byte b = 127; // recebe valores de -128 até 127.
		short s = 32767;
		int i = 2_147_483_647;
		long l = 9_223_372_036_854_775_807L; // usa-se o L no final por se tratar de um número literal e o padrão é inteiro
		System.out.printf("%d %d %d %d - Tipos Inteiros\n", b, s, i, l);
		System.out.println(Integer.toBinaryString(b)); // demonstração no formato binário
		System.out.println(Integer.toBinaryString(s));
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Long.toBinaryString(l));
		
		// Tipos primitivos reais (ponto flutuante)
		float f = 3.1416f;
		double d = 2.45;
		System.out.printf("%.2f %.1f - Tipos Reais\n", f, d);
	}
}
