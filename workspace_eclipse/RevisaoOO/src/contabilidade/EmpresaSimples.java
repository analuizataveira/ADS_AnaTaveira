package contabilidade;

public class EmpresaSimples implements Tributavel {
	
	Double faturamentoMensal;

	
	static final Double TAXA_IR_EMPRESA_SIMPLES = 0.15;
	private static final double TAXA_ISS_EMPRESA_SIMPLES = 0.08;
	
	
	
	public EmpresaSimples(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() 
	{
		return this.faturamentoMensal*TAXA_IR_EMPRESA_SIMPLES;
	}

	@Override
	public Double getValorISS() 
	{
		return this.faturamentoMensal*TAXA_ISS_EMPRESA_SIMPLES;
	}
	
	

}
