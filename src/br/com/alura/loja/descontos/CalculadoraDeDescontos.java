package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {
	
//	Não sabemos o tipo de desconto, então verificamos tipo por tipo, chamando um dentro do outro para verificar se está passando para o próximo ou não
	public BigDecimal calcular(Orcamento orcamento) {
		
//		Atributo que instancia um tipo de desconto, caso não seja aplicável, enviamos no parametro o próximo Desconto
		Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto()));

		return cadeiaDeDescontos.calcular(orcamento);
	}
}
