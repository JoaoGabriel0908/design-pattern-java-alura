package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;

public class Orcamento {
	
	private SituacaoOrcamento situacao;
	private BigDecimal valor;
	private int quantidadeItens;
	
	public Orcamento(BigDecimal valor, int quantidadeItens) {
		super();
		this.quantidadeItens = quantidadeItens;
		this.valor = valor;
		this.situacao = new EmAnalise();
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.aprovar(this);
	}
	
	
	public void finalizar() {
		this.situacao.aprovar(this);
	}
	
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

}
