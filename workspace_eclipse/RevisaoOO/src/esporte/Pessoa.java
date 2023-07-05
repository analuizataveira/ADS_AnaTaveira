package esporte;

public class Pessoa extends Object{

	String name;
	Integer idade;
	
	
	public Pessoa(String name, Integer idade) {
		super();
		this.name = name;
		this.idade = idade;
	}
	
	void envelhecer() 
	{
	this.idade+=2;
	}
	
}
