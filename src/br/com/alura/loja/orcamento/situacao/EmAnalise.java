package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.SituacaoOrcamento;

public class EmAnalise extends SituacaoOrcamento{

	
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
	
}
