package desafio1;
import java.util.ArrayList;
import java.util.Collections;
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
		int n;
		
		System.out.println("Informe um n�mero inteiro positivo: ");
		n = buscarNumero(scanner, "N�mero n�o aceito, digite um n�mero entre 1 e 10^5: ", true);
		
		List<Integer> listaNumeros = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int aux = buscarNumero(scanner, "N�mero n�o aceito, digite um n�mero inteiro n�o negativo ", false);
			listaNumeros.add(aux);
		}
		
		System.out.println("Sa�da: ");
		
		ComparadorInteiro comparador = new ComparadorInteiro();
		
		Collections.sort(listaNumeros, comparador);
		
		for(Integer num : listaNumeros) {
			System.out.println(num);
		}
	
	}

	private static int buscarNumero(Scanner scanner, String mensagemErro, boolean isValidacao1) {
		int n;
		boolean entradaInvalida;
		do {
			n = scanner.nextInt();
			
			entradaInvalida = isNumeroInvalido(n, isValidacao1);

			if(entradaInvalida) {
				System.out.println(mensagemErro);
			}
		} while(entradaInvalida);
		return n;
	}

	private static boolean isNumeroInvalido(int n, boolean isValidacao1) {
		if(isValidacao1) {
			return n < 1 || n > 100000;
		} else {
			return n < 1;
		}
	}
}
