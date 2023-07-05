package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ContabilidadeTeste {

	
	
	@org.junit.jupiter.api.Test
	
	void testeEmpresaMEI()
	{
		EmpresaMEI empresa = new EmpresaMEI(100.0);
		
		Double valorIREsperado = 27.5;
		assertEquals(valorIREsperado, empresa.getValorIR(),2);
		
		Double valorISSEsperado = 0.0;
		assertEquals(valorISSEsperado, empresa.getValorISS());
		
		
	}
	
	@Test
	void testeEmpresaSimples()
	{
		
		EmpresaSimples empresa = new EmpresaSimples(100.0);
		
		Double valorIREsperado = 15.0;
		assertEquals(valorIREsperado, empresa.getValorIR());
		
		Double valorISSEsperado = 8.0;
		assertEquals(valorISSEsperado, empresa.getValorISS());
		
		
	}
	
	
	
}
