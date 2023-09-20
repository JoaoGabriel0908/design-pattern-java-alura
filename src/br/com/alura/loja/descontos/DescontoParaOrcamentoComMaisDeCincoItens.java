package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//Essa classe não conhece o passo a passo para verificar o efetuamento do cálculo
//Ela herda da classe mãe, dois métodos abstratos que apenas aplica o desconto "efetuar calculo" e passa o boolean se deve aplicar
public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto{
	
//	Caso não seja aplicada, passamos o próximo desconto no parametro
	public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}
	
	
}
