package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraImpostos {
	
	public BigDecimal calcular(Orcamento orcamento, TipoImpostoCalc tipoImposto) {
		return tipoImposto.calcular(orcamento);
	}
	
	
}
