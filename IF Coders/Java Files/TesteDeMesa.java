package ifCoders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Teste de Mesa
 * 
 * Conhecido por muitos programadores, um Teste de Mesa eh realizado
 * com o proposito de executar passo a passo um determinado algoritmo.
 * O intuito eh descobrir se a logica aplicada esta sendo cumprida.
 * 
 * Muito parecido com o modo Debug de alguns IDEs, porem na forma mais
 * manual.
 * 
 * @author Emerson
 * @since 2023
 * */
public class TesteDeMesa {
	
	private static Scanner sc = new Scanner(System.in);
	private static Map<String, List<String>> variables = new HashMap<>();
	private static int numVar = 0, numIteration = 0;
	
	/**
	 * Menu com as opcoes disponiveis para o usuario, onde 1 sera
	 * para continuar na proxima instrucao, 2 para visualizar as
	 * variaveis na Mesa e 3 para sair.
	 * */
	private static void menu() {
		System.out.println( "\nDigite uma opcao:\n"
				+ "\t1- Continuar\n"
				+ "\t2- Mostrar Mesa\n"
				+ "\t3- Abortar"
				);
	}
	
	/**
	 * Metodo responsavel por inserir os primeiros valores das
	 * variaveis que irao compor o Teste de Mesa. 
	 * */
	private static void firstInputValuesInTable() {
		for(int i = 0; i < numVar; i++) {
			System.out.print("Nome da Variavel: ");
			String nameVar = sc.next();
			
			System.out.print("Valor de " + nameVar + ": ");
			String valueVar = sc.next();
			
			variables.put(nameVar, new ArrayList<>());
			variables.get(nameVar).add(valueVar);
		}
		
		numIteration++;
	}
	
	/**
	 * Metodo responsavel por fazer outra iteracao do Teste
	 * inserindo os novos valores para as variaveis.
	 * */
	private static void inputValuesInTable() {
		for(String key : variables.keySet()) {
			System.out.print("Novo valor para " + key + ": ");
			String newValue = sc.next();
			variables.get(key).add(newValue);
		}
		
		numIteration++;
	}
	
	/**
	 * Imprime as variaveis e seus respectivos valores.
	 * */
	private static void showValues() {
		for(String key : variables.keySet()) {
//			int maxLength = Collections.max(
//					variables2.get(key), (s1, s2) -> (s1.length() > s2.length()) ? 1 : -1)
//					.length();
			
			System.out.print(key);
			for(String value : variables.get(key)) {
				System.out.print(" -> " + value);
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char opcao = '1';
		
		// Pegando a quantidade de variaveis
		System.out.print("Quantas variaveis estarao no Teste de Mesa? ");
		numVar = sc.nextInt();
		
		// Se nao houver variaveis, entao o programa acaba
		if(numVar <= 0) {
			System.exit(0);
		}
		
		// Setando o nome e valor na primeira execucao
		firstInputValuesInTable();
		
		// Exibindo o menu para o usuario escolher a opcao
		menu();
		opcao = sc.next().charAt(0);
		
		// Enquanto for dirente de '2' o programa continua
		while(opcao != '3') {
			
			// Setando os valores para as proximas execucoes
			if(opcao == '1') {
				System.out.println("\nImprimindo valores...");
				showValues();
				System.out.println("Numero de Iteracoes: " + numIteration);
				
				System.out.println("\nSetando novos valores para as variaveis...");
				inputValuesInTable();
			}else if(opcao == '2') {
				System.out.println("\nImprimindo valores...");
				showValues();
				System.out.println("Numero de Iteracoes: " + numIteration);
			}
			
			// Imprimindo novamente o menu
			menu();
			opcao = sc.next().charAt(0);
		}
	}

}
