package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class TipoImpostoCalc {
	
	private TipoImpostoCalc outro;
	
	public TipoImpostoCalc(TipoImpostoCalc outro) {
		super();
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) { 
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		
		if(outro != null) {
			valorDoOutroImposto = realizarCalculo(orcamento);
		}
		
		return valorImposto.add(valorDoOutroImposto);
	}
}
