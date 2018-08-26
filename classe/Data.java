package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		this(13, 10, 1979);
	}
	
	Data(int d, int m, int a){
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
	
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
