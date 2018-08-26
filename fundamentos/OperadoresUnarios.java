package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		// incremento e decremento
		num1++; // incremento pós fixado
		System.out.println(num1);
		--num1; // incremento pré ixado
		System.out.println(num1);
		
		// precedência no incremento e decremento
		System.out.println(++num1 == num2--); // não é uma boa prática de programação
		System.out.println(num1 == num2);
		
		// complemento binário
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		// negação
		System.out.println(!false);
	}
}
