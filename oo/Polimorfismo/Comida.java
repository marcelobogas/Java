package oo.Polimorfismo;

public class Comida {

	/**
	 * peso em Kg     Tecla de atalho p/ javaDoc ALT + SHIFT + letra J
	 */
	private double peso = 0;
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if (peso > 0) 
			this.peso = peso; 
	}
}
