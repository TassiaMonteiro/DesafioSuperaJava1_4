package desafio4;

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
		
		Integer n = scanner.nextInt();
		scanner.nextLine();

		List<String> texto = new ArrayList<>();

		for(int i = 0; i < n; i ++) {
			String linha = scanner.nextLine();
			texto.add(linha);
		}
		
		for(String linha : texto) {
			System.out.println(desembaralharLinha(linha));
		}
	}

	private static String desembaralharLinha(String linha) {
		String textoDesembaralhado;
		
		String parteEsquerda = linha.substring(0, linha.length() / 2);
		
		String parteDireita = linha.substring(linha.length() / 2, linha.length());
		
		textoDesembaralhado = inverterTexto(parteEsquerda) + inverterTexto(parteDireita);
		
		return textoDesembaralhado;
	}
	
	private static String inverterTexto(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}

}
