package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);
		
//		Instanciando a calculadora de descontos, mandando calcular passando o orçamento e a quantidade de itens
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento));
		System.out.println(calculadora.calcular(segundoOrcamento));
	}
}
