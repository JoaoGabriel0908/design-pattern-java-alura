package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

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
		Orcamento orcamento = new Orcamento(gerarPedido.getValorOrcamento(), gerarPedido.getQuantidadeItens());
		
		Pedido pedido = new Pedido(gerarPedido.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(acao -> acao.executar(pedido));
	
	}

}
