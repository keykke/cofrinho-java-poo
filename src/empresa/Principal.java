package empresa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao = -1;

        //Laço de repetição para exibição do menu
        while (opcao != 0) {
            System.out.println("--- MENU COFRINHO ---");
            System.out.println("1-Adicionar | 2-Remover | 3-Listar | 4-Total | 0-Sair");
            
            //Tratamento de exceção
            try {
                opcao = teclado.nextInt();
                //switch case para seleção de opções de uso do cofre
                switch (opcao) {
                	//Adcionar moedas
                    case 1:
                        System.out.println("Tipo: 1-Real | 2-Dolar | 3-Euro");
                        int tipo = teclado.nextInt();
                        System.out.println("Valor:");
                        double v = teclado.nextDouble();
                        
                        if (v <= 0) {
                            System.out.println("Erro: O valor deve ser maior que zero!");
                            break;
                        }

                        Moeda m = null;
                        if (tipo == 1) m = new Real(v);
                        else if (tipo == 2) m = new Dolar(v);
                        else if (tipo == 3) m = new Euro(v);

                        if (m != null) {
                            cofrinho.add(m);
                            System.out.println("Adicionado!");
                        } else {
                            System.out.println("Tipo de moeda inválido!");
                        }
                        break;
                    //Remover moedas
                    case 2:
                        System.out.println("Tipo: 1-Real | 2-Dolar | 3-Euro");
                        int tipoR = teclado.nextInt();
                        System.out.println("Valor:");
                        double vR = teclado.nextDouble();

                        Moeda moedaRemover = null;
                        if (tipoR == 1) moedaRemover = new Real(vR);
                        else if (tipoR == 2) moedaRemover = new Dolar(vR);
                        else if (tipoR == 3) moedaRemover = new Euro(vR);

                        if (moedaRemover != null && cofrinho.remover(moedaRemover)) {
                            System.out.println("Moeda removida com sucesso!");
                        } else {
                            System.out.println("Erro: Moeda não encontrada no cofrinho!");
                        }
                        break;
                    //Listar moedas
                    case 3:
                        cofrinho.listagemMoedas();
                        break;
                    //Conversão total das moedas
                    case 4:
                        System.out.printf("Total convertido: R$ %.2f %n", cofrinho.totalConvertido());
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números!");
                teclado.nextLine();
                opcao = -1; 
            }
        }
        System.out.println("Sistema encerrado.");
    }
}