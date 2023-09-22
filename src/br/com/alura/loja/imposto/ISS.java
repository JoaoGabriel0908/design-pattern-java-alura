package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class ISS extends TipoImpostoCalc{
	public ISS(TipoImpostoCalc outro) {
		super(outro);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal realizarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.6"));
	}
}
