package builder.pizzaria;

import java.nio.channels.IllegalSelectorException;

public class PizzaBuilder {


public Pizza getPizza()
{
	validateSize();
	validateIngredients();
	return pizza;
	
}

private void validateSize() {
	
	Integer s = pizza.getSize();
	if(s<=0 || s>3)
	{
		throw new ise("Tamanho inválido");
	}
}




}