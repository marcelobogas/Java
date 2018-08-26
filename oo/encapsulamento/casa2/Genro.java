package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro1;

public class Genro {

	public String segredo = "Minha sogra fala demais!";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Nunca falarei..." + euMesmo.segredo);
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
		
		Sogro1 sograo = new Sogro1();
		System.out.println(sograo.gostaDeCerveja);
		
		//Sogra1 sogrinha = new Sogra1();
		//System.out.println(sogrinha.segredoDeFamilia); // variável de nível protected, só pode ser usada por herança
	}
}