package br.com.alura.loja.orcamento;

import java.util.Map;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroOrcamento {
	
	private HttpAdapter http;
	
	public RegistroOrcamento(HttpAdapter http) {
		super();
		this.http = http;
	}

	public void registrar(Orcamento orcamento) {
		
		if(!orcamento.isFinalizado()) {
			throw new DomainException("Orçamento não finalizado");
		}
		
		String url = "http://api.externa";
		Map<String, Object> dados= Map.of(
				"valor", orcamento.getValor(),
				"Quantidade de itens", orcamento.getQuantidadeItens()
				);
		http.post(url, dados);
	}

}
