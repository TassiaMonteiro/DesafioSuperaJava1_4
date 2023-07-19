package desafio2;

import java.text.DecimalFormat;

/**
 * @author Tassia
 *
 */
public class QuantidadeValor {

	Double valorMoeda;
	Integer quantindade;

	public QuantidadeValor(Double valorMoeda, Integer quantindade) {
		super();
		this.valorMoeda = valorMoeda;
		this.quantindade = quantindade;
	}

	public Integer getQuantindade() {
		return quantindade;
	}

	public void setQuantindade(Integer quantindade) {
		this.quantindade = quantindade;
	}

	public Double getValorMoeda() {
		return valorMoeda;
	}

	public void setValorMoeda(Double valorMoeda) {
		this.valorMoeda = valorMoeda;
	}
	
	public String getValorFormatado() {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(this.valorMoeda); 
	}

}
