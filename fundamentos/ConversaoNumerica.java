package fundamentos;

public class ConversaoNumerica {

	public static void main(String[] args) {
		// exemplo 1 - convers�o expl�cita
		float f = (float) 0.1;
		System.out.println(f);
		
		// exemplo 2 - convers�o expl�cita
		int i1 = (int) 7.9;
		System.out.println(i1);
		
		// emplo 3 - convers�o impl�cita
		int i2 = 'a';
		System.out.println(i2);
		
		// exemplo 4 - convers�o impl�cita
		double d = 1001;
		System.out.println(d);
	}
}
