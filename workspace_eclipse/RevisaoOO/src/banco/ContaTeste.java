package banco;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.TestTemplate;

public class ContaTeste {
	

	@org.junit.jupiter.api.Test
	void testarContaCorrente()
	{
		Double saldoEsperado = 101.0;
		Double saldoObtido = 0.0;
		
		
		
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.depositar(100.0);
		contaCorrente.rentabilizar();
			
		
		assertEquals(saldoEsperado, contaCorrente.saldo);
		
		
	}
	
	@org.junit.jupiter.api.Test
	
	void testarContaPoupanca() {
		
		Double saldoEsperado = 102.0;
		
		ContaPoupanca poupanca = new ContaPoupanca();
		poupanca.depositar(100.0);
		poupanca.rentabilizar();
		
		assertEquals(saldoEsperado, poupanca.saldo);
		
		
	}

	

@org.junit.jupiter.api.Test
	void  testePolimorfismo() {
		
		boolean flagContaCorrenteComoDefaul = true;
		
		Conta conta = null;
		if(flagContaCorrenteComoDefaul){
			conta = new ContaCorrente();	
		}else{
			conta = new ContaPoupanca();	
		}

		conta.depositar(1000.00);
		
		conta.rentabilizar();
		
		System.out.println(conta.getClass().getName());
		System.out.println(conta.saldo);		
}

@org.junit.jupiter.api.Test
void testConta_toString()
{
	
	Conta conta = new ContaCorrente();
	conta.depositar(100.00);
	conta.sacar(10.00);
	
	
	String str = conta.toString();
	System.out.println(str);		

	
}

}

	

