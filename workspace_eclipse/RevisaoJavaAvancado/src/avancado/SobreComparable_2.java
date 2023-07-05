package avancado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SobreComparable_2 {

	public static void main(String[] args) {

		List<Animal> listaDeAnimais = new ArrayList<>();
		
		listaDeAnimais.add(new Animal(1L, "Tartaruga"));
		listaDeAnimais.add(new Animal(2L, "Coelho"));
		listaDeAnimais.add(new Animal(3L, "Cachorro"));
		listaDeAnimais.add(new Animal(4L, "Gato"));
		listaDeAnimais.add(new Animal(5L, "Girafa"));
		listaDeAnimais.add(new Animal(6L, "Gato"));
		
		
		System.out.println("> Pela ordem de inserçã0: ");
		System.out.println(listaDeAnimais);
		
		System.out.println("> Pela ordem alfabética");
		Collections.sort(listaDeAnimais);
		System.out.println(listaDeAnimais);
	}
	
	
}
