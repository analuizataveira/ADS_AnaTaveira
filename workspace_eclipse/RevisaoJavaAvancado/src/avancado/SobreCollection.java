package avancado;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class SobreCollection {

	public static void main(String[] args) {
		
		Collection<String> colecao = buildCollectionImplementation();
		
		colecao.add("Gato");
		colecao.add("Cachorro");
		colecao.add("Leão");
		colecao.add("Pantera");
		colecao.add("Avestruz");

	
	System.out.println(colecao);
	
	}

	/* private static Collection<String> buildCollectionImplementation() {
		// TODO Auto-generated method stub
		return new HashSet<String>();
	}

	private static ArrayList<String> extracted() {
		return new ArrayList<String>();
	}
	*/
	
	private static Collection<String> buildCollectionImplementation() {
		// TODO Auto-generated method stub
		return new TreeSet<String>();
	}
	
	
	
	
	
	
	
}
