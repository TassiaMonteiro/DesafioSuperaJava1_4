package desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Tassia
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Integer n, k;
		
		String nk = scanner.nextLine();
		
		String[] valores = nk.trim().split(" ");
		
		n = Integer.valueOf(valores[0]);
		k = Integer.valueOf(valores[1]);
		
		String array = buscarArray(scanner, n) ;
		
		String[] arrayDividido = array.split(" ");
		
		List<Integer> numeros = new ArrayList<>();
		for(String num : arrayDividido) {
			numeros.add(Integer.valueOf(num));
		}
		
		Integer quantidade = 0;
		
		for(int i = 0; i < numeros.size(); i++) {
			for(int j = 0; j < numeros.size(); j++) {
				if(i == j) {
					continue;
				}
				
				if ( i - j == k) {
					quantidade++;
				}
			}
		}
		
		System.out.println(quantidade);
	}
	
	private static String buscarArray(Scanner scanner, Integer k) {
		String array;
		boolean entradaInvalida;
		do {
			array = scanner.nextLine();
			Integer tamanhoArray = array.trim().split(" ").length;
			entradaInvalida =  tamanhoArray > k || tamanhoArray < k;

			if(entradaInvalida) {
				System.out.println("Digite um array com o numero de itens informado anteriormente");
			}
		} while(entradaInvalida);
		
		return array.trim();
	}

}
