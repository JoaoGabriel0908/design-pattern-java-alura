package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.descontos.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		Orcamento segundoOrcamento = new Orcamento();
		
		orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
		segundoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
		
//		Instanciando a calculadora de descontos, mandando calcular passando o orçamento e a quantidade de itens
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento));
		System.out.println(calculadora.calcular(segundoOrcamento));
	}
}
