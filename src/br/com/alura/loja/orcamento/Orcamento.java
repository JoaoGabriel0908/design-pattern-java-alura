package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;

public class Orcamento implements Orcavel{
	
	private SituacaoOrcamento situacao;
	private BigDecimal valor;
	private List<Orcavel> itens = new ArrayList<>();
	
	public Orcamento() {
		super();
		this.itens = new ArrayList<>();
		this.valor = BigDecimal.ZERO;
		this.situacao = new EmAnalise();
	}

	public int getQuantidadeItens() {
		return itens.size();
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

	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}
	
	public void adicionarItem(Orcavel item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
	}

}
