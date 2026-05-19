package empresa;

public class Euro extends Moeda{
	public Euro(double valor) {
		super(valor);
	}
	//Usado no método de listagem, sendo mais fácil visualizar quantas moedas de cada o usuario possui
	public void info(){
		System.out.println(valor+" Euros");
	}
	
	//Método de conversão
	public double converter() {;
		return valor*5.81;
	}

}
