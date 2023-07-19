package desafio2;

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
		
		List<QuantidadeValor> listaMoedas = preencherMoedas();
		
		Scanner scanner = new Scanner(System.in);
		Double valor;
		
		System.out.println("Informe um valor:  ");
		valor = buscarNumero(scanner);
		
		for(QuantidadeValor qV : listaMoedas) {
			valor = buscarQuantidadeNotas(qV, valor);
		}
		
		System.out.println("NOTAS: ");
		for(QuantidadeValor qV : listaMoedas) {

			if(qV.getValorMoeda() == 1) {
				System.out.println("MOEDAS: ");
			}
			
			System.out.println( qV.getQuantindade() + (qV.getValorMoeda() > 1 ? " notas(s) de R$ " : " moeda(s) de R$ ") + qV.getValorFormatado() );
		}

	}

	private static List<QuantidadeValor> preencherMoedas() {
		List<QuantidadeValor> listaMoedas = new ArrayList<>();
		
		listaMoedas.add(new QuantidadeValor(100.00, 0));
		listaMoedas.add(new QuantidadeValor(50.00, 0));
		listaMoedas.add(new QuantidadeValor(20.00, 0));
		listaMoedas.add(new QuantidadeValor(10.00, 0));
		listaMoedas.add(new QuantidadeValor(5.00, 0));
		listaMoedas.add(new QuantidadeValor(2.00, 0));
		listaMoedas.add(new QuantidadeValor(1.00, 0));
		listaMoedas.add(new QuantidadeValor(0.50, 0));
		listaMoedas.add(new QuantidadeValor(0.25, 0));
		listaMoedas.add(new QuantidadeValor(0.10, 0));
		listaMoedas.add(new QuantidadeValor(0.05, 0));
		listaMoedas.add(new QuantidadeValor(0.01, 0));
		
		return listaMoedas;
	}
	
	private static Double buscarQuantidadeNotas(QuantidadeValor qV, Double valor) {

		int quantidade = 0;
		if(valor >= qV.getValorMoeda()) {
			quantidade = (int) (valor / qV.getValorMoeda());
            valor = valor % qV.getValorMoeda();
		}
		
		qV.setQuantindade(quantidade);

		return valor;
	}

	
	private static Double buscarNumero(Scanner scanner) {
		Double n;
		boolean entradaInvalida;
		do {
			n = scanner.nextDouble();
			
			entradaInvalida = n < 0 || n > 1000000 ;

			if(entradaInvalida) {
				System.out.println("Número não aceito, digite um número entre 1 e 1000000");
			}
		} while(entradaInvalida);
		
		return n;
	}

	

}
