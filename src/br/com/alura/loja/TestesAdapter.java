package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroOrcamento;

public class TestesAdapter {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

//		Método para aprovar
		orcamento.aprovar();
		
//		Após aprovar finaliza ele
		orcamento.finalizar();
		
//		Quando instaciar a classe de requisitar posição precisamos passar o adaptador de HTTP
		RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
		registroOrcamento.registrar(orcamento);
	}

}
