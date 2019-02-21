package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		// incremento e decremento
		num1++; // incremento p�s fixado
		System.out.println(num1);
		--num1; // incremento pr� ixado
		System.out.println(num1);
		
		// preced�ncia no incremento e decremento
		System.out.println(++num1 == num2--); // n�o � uma boa pr�tica de programa��o
		System.out.println(num1 == num2);
		
		// complemento bin�rio
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		// nega��o
		System.out.println(!false);
	}
}
