package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.SituacaoOrcamento;

public class Finalizado extends SituacaoOrcamento {
	
	@Override
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orçamento Finalizado não pode ter desconto extra");
	}
}
