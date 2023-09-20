package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//Essa classe não conhece o passo a passo para verificar o efetuamento do cálculo
//Ela herda da classe mãe, dois métodos abstratos que apenas aplica o desconto "efetuar calculo" e passa o boolean se deve aplicar
public class DescontoParaOrcamentoMaiorQueQuinhentos extends Desconto{
	public DescontoParaOrcamentoMaiorQueQuinhentos(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
