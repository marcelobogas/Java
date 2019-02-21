package Exercicios;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario dados = new Funcionario();
		dados.nome = "Marcelo";
		dados.salario = 3500.00;
		dados.funcao = "Analista";
		
		Funcionario novo = new Funcionario("Andréa", 1800.00, "Financeiro");
		
		System.out.println(dados.formatar());
		System.out.printf("\n");
		System.out.println(novo.formatar());
	}
}
