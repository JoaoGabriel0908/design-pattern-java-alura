package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class Reprovado {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.5"));
	}
	
	public void aprovar(Orcamento orcamento) {
//		orcamento.setSituacao(New Aprovado());
	}
	
	public void reprovar(Orcamento orcamento) {
//		orcamento.setSituacao(New Reprovar());
	}
	
}
