package oo.Polimorfismo;

public class Pessoa {

	/**
	 * Peso em Kg
	 */
	private double peso = 0;
	
	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}
	
	public double getPeso() {
		return peso;
	}
	
	// m�todo Varargs
	public void comer(Comida... comidas) {
		for(Comida c: comidas) {
			this.peso += c.getPeso();
		}
	}
	
	
	/*
	// Polimorfismo Din�mico
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	*/
	
	// Polimorfismo Est�tico
	
	/*public void comer(Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void comer(Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	
	public void comer(Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}*/
	
}
