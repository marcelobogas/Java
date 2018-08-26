package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data nascimento = new Data();
		//nascimento.dia = 13;
		//nascimento.mes = 10;
		//nascimento.ano = 1979;
		
		Data casamento = new Data(16, 11, 2002);
		
		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
	}
}
