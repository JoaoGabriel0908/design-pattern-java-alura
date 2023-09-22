package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class Reprovado {
	
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
	
}
