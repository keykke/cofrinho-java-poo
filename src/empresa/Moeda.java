package empresa;

import java.util.Objects;

public abstract class Moeda{
	double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}

	public abstract void info();
	public abstract double converter();
	
	//uso do equals para remoção de moedas especificando-as
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda outra = (Moeda) obj;
		return Double.compare(outra.valor, this.valor) == 0;
	}
}
	
	
