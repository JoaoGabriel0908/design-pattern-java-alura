package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class GerarPedido {
	
	private String cliente;
	private int quantidadeItens;
	private BigDecimal valorOrcamento;
	
	public GerarPedido(String cliente, int quantidadeItens, BigDecimal valorOrcamento) {
		super();
		this.cliente = cliente;
		this.quantidadeItens = quantidadeItens;
		this.valorOrcamento = valorOrcamento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(BigDecimal valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}
	

}
