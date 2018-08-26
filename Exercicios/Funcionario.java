package Exercicios;

public class Funcionario {
	String nome;
	Double salario;
	String funcao;
	
	Funcionario(){
		
	}
	
	Funcionario(String n, double s, String f){
		nome = n;
		salario = s;
		funcao = f;
	}

	String formatar() {
		return String.format("Nome: %s \nSalario: %.2f \nFunção: %s", nome, salario, funcao);
	}
}