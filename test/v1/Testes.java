package v1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Testes {

	@Test
	public void exemplo() {
		Pessoa p1 = new Pessoa("Fulano", false, false);
		Pessoa p2 = new Pessoa("Ciclana", false, false);
		Pessoa p3 = new Pessoa("Beltrana", false, false);
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulano");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Ciclana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Beltrana");
		
		f.removePessoa(proximo);
	}

	@Test
	public void TesteGravida() {
		Pessoa pessoa1 = new Pessoa("Anna", false, false);
		Pessoa pessoa2 = new Pessoa("Fulana", true, false);
		Pessoa pessoa3 = new Pessoa("Ciclana", false, false);
		
		Fila f = new Fila();
		
		f.addPessoa(pessoa1);
		f.addPessoa(pessoa2);
		f.addPessoa(pessoa3);
		
		Pessoa proximo = f.proximoFila();
		
	Assert.assertEquals(proximo.getNome(), "Fulana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Fulana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulana");
		
		f.removePessoa(proximo);
	}
	
	@Test
	public void TesteIdoso() {
		Pessoa pessoa1 = new Pessoa("Anna", false, false);
		Pessoa pessoa2 = new Pessoa("Fulana", true, false);
		Pessoa pessoa3 = new Pessoa("Beltrano", false, true);
		
		Fila f = new Fila();
		
		f.addPessoa(pessoa1);
		f.addPessoa(pessoa2);
		f.addPessoa(pessoa3);
		
		Pessoa proximo = f.proximoFila();
		
	Assert.assertEquals(proximo.getNome(), "Beltrano");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Fulana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulana");
		
		f.removePessoa(proximo);
	}
}
