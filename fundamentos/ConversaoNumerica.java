package fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		// exemplo 1 - conversão explícita
		float f = (float) 0.1;
		System.out.println(f);
		
		// exemplo 2 - conversão explícita
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// emplo 3 - conversão implícita
		int i2 = 'a';
		System.out.println(i2);
		
		// exemplo 4 - conversão implícita
		double d = 1001;
		System.out.println(d);
	}
}
