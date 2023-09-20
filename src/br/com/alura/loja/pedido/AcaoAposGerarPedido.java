package br.com.alura.loja.pedido;

import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public interface AcaoAposGerarPedido {
	public void executar(Pedido pedido);
}
