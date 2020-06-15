import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testPizza {	
	
	@BeforeEach
	void testBeforePizza() {		
		Pizza.zeraRegistroIngredientes();
		assertEquals(0, Pizza.ingredientes.size());		
	}
	
	@Test
	void testAdicionaIngrediente() {
		Pizza pizza1 = new Pizza("mussarela");
		pizza1.adicionaIngrediente("mussarela");
		pizza1.adicionaIngrediente("tomate");
		assertEquals(2, Pizza.ingredientes.size());
		pizza1.adicionaIngrediente("mussarela");
		assertEquals(2, Pizza.ingredientes.get("mussarela"));
		
	}
	
	@Test
	void testVerificaPreco() {
		Pizza pizza1 = new Pizza("mussarela");
		pizza1.adicionaIngrediente("mussarela");
		assertEquals(15, pizza1.getPreco());
		pizza1.adicionaIngrediente("tomate");
		assertEquals(15, pizza1.getPreco());
		pizza1.adicionaIngrediente("mussarela");
		assertEquals(20, pizza1.getPreco());
		pizza1.adicionaIngrediente("mussarela");
		assertEquals(20, pizza1.getPreco());
		pizza1.adicionaIngrediente("mussarela");
		assertEquals(20, pizza1.getPreco());
		pizza1.adicionaIngrediente("mussarela");
		assertEquals(23, pizza1.getPreco());
		pizza1.adicionaIngrediente("mussarela");
		assertEquals(23, pizza1.getPreco());
	}
	
	
	@Test
	void adicionaPizzasCarrinho(){
		
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza("mussarela");
		pizza1.adicionaIngrediente("mussarela");
		
		meuCarrinho.adiciona(pizza1);
		assertEquals(1, meuCarrinho.quantidade);
		
		Pizza pizza2 = new Pizza("portuguesa");
		pizza2.adicionaIngrediente("mussarela");
				
		meuCarrinho.adiciona(pizza2);
		assertEquals(2, meuCarrinho.quantidade);
	}
	
	@Test
	void verificaCarrinhoVazio(){
		
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza("mussarela");		
		meuCarrinho.adiciona(pizza1);
		assertEquals(0, meuCarrinho.quantidade);
		
		pizza1.adicionaIngrediente("mussarela");
		meuCarrinho.adiciona(pizza1);
		assertEquals(1, meuCarrinho.quantidade);
		
	}
	
	@Test
	void totalizaCarrinho(){
		
		CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();
		
		Pizza pizza1 = new Pizza("mussarela");			
		pizza1.adicionaIngrediente("mussarela");
		pizza1.adicionaIngrediente("tomate");
		
		Pizza pizza2 = new Pizza("presunto");			
		pizza2.adicionaIngrediente("mussarela");
		pizza2.adicionaIngrediente("presunto");
		pizza2.adicionaIngrediente("azeitona");
		
		Pizza pizza3 = new Pizza("portuguesa");			
		pizza3.adicionaIngrediente("mussarela");
		pizza3.adicionaIngrediente("presunto");
		pizza3.adicionaIngrediente("azeitona");
		pizza3.adicionaIngrediente("aliche");
		pizza3.adicionaIngrediente("ovo");
		pizza3.adicionaIngrediente("cebola");
		
		assertEquals(0, meuCarrinho.getTotal());
		
		meuCarrinho.adiciona(pizza1);
		assertEquals(15, meuCarrinho.getTotal());
		
		meuCarrinho.adiciona(pizza2);
		assertEquals(35, meuCarrinho.getTotal());
		
		meuCarrinho.adiciona(pizza3);
		assertEquals(58, meuCarrinho.getTotal());	
		
		
		
	}

}
