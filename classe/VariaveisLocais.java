package classe;

public class VariaveisLocais {

	int a = 2;
	int a1 = 7;
	
	void teste1() {
		int a1 = 2;
		System.out.println(a);
		System.out.println(a1);
		
		if(a1 > 3) {
			int a2 = 3;
		}
	}
	
	// não gera conflito de variáveis, pois estão em blocos diferentes
	void teste2() {
		int a1 = 7;
		System.out.println(a1); //usando a variável local
		System.out.println(this.a1); //usando a variável de instância
	}

}
