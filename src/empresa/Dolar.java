package empresa;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		super(valor);
	}
	
	//usado no método de listagem, sendo mais fácil visualizar quantas moedas de cada o usuario possui
	public void info(){
		System.out.println(valor+" Dólares");
	}
	//Método de conversão
	public double converter() {
		return valor*4.93;
	}
}
