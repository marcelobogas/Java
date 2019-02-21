package fundamentos;

public class VariaveisEConstantes {
	
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio;
		
		System.out.println("¡rea È " + area + " m2.");
		System.out.printf("¡rea È %f m2.", area);
		System.out.printf("\n¡rea È %.2f m2", area);
	}
}
