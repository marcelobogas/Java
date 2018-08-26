package oo.Heranca;

public class TesteDrive {

	public static void main(String[] args) {
		Carro c = new Civic();
		c.acelerar();
		System.out.println(c.getVelocidadeAtual() + " KM/H");
		
		c = new Ferrari();
		c.acelerar();
		System.out.println(c.getVelocidadeAtual() + " KM/H");
	}
}
