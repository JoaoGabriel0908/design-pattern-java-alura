package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
	
	public abstract BigDecimal calcularValorDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) {
		throw new br.com.alura.loja.exception.DomainException("Orçamento não pode ser aprovado");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new br.com.alura.loja.exception.DomainException("Orçamento não pode ser reprovado");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new br.com.alura.loja.exception.DomainException("Orçamento não pode ser final!");
	}
}
