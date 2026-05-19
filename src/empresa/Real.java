package empresa;

public class Real extends Moeda {
	
	public Real(double valor) {
		super(valor);
	}
	
	//Usado no método de listagem, sendo mais fácil visualizar quantas moedas de cada o usuario possui
	public void info(){
		System.out.println(valor+" Reais");
	}
	
	//Não necessariamente precisa de conversão, somente o valor propriamente dito
	public double converter() {
		return valor;
	}
}
