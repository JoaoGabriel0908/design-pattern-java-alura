package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class GerarPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
	
	public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		super();
		this.acoes = acoes;
	}
	
	public void executar(GerarPedido gerarPedido) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("250")));
		
		Pedido pedido = new Pedido(gerarPedido.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(acao -> acao.executar(pedido));
	
	}

}
