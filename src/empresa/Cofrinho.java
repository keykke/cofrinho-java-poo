package empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Cofrinho{
	
	public Cofrinho(ArrayList <Moeda> listaMoedas) {
		this.listaMoedas = listaMoedas;
	}

	public Cofrinho() {}

	private ArrayList <Moeda> listaMoedas = new ArrayList();
	
	//Método para adição de moedas
	public boolean add(Moeda m) {
		return listaMoedas.add(m);
	}
	
	//Método para remoção de moedas
	public boolean remover(Moeda m) {
		return listaMoedas.remove(m);
	}
	
	//Método para listagem de moedas
	public void listagemMoedas() {
		if(listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio");
		}
		
		System.out.println("--- Moedas no Cofrinho ---");
		
		for(Moeda m : listaMoedas) {
			m.info();
		}
		System.out.println("--------------------------");
	}
	
	//Método para conversão de moedas
	public double totalConvertido() {
		if(listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio");
		}
		
		//Para cada moeda da lista, irá converter seu valor em real e adicionar-se ao acumulador
		double acumulador = 0;
		for(Moeda m : listaMoedas) {
			acumulador+=m.converter();
		}
		return acumulador;
		}
}
