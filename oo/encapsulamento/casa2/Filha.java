package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra1;
import oo.encapsulamento.casa1.Sogro1;

public class Filha extends Sogra1 {

	String segredoDoCasal = "Meu marido está quase sendo demitido";
	
	public static void main(String[] args) {
		Filha euMesma = new Filha();
		System.out.println("Meus pais não sabem, " + euMesma.segredoDoCasal);
		System.out.println(euMesma.segredoDeFamilia); // atributo herdado da classe a qual pertence, agora faz parte desta também
		
		//Genro meuAmor = new Genro();
		//System.out.println(meuAmor.segredo); // variável do tipo privada, não é possível acesso
		
		Sogro1 papai = new Sogro1();
		System.out.println(papai.gostaDeCerveja);
		
		//Sogra1 mamae = new Sogra1();
		//System.out.println(mamae.segredoDeFamilia);
		// não se usa instância quando é usado a herança
	}
}
