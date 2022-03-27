import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaralhoPermutaRandomicamente implements Embaralhador {
	public static List<String> lista = new ArrayList<String>();

	public static List<String> getLista() {
		return lista;
	}

	private List<Character> stringToCharList(String str) {
		List<Character> list = new ArrayList<Character>();
		for (char ch : str.toCharArray()) {
			list.add(ch);
		}
		return list;
	}

	private void permute(java.util.List<Character> arr, int k) {
		for (int i = k; i < arr.size(); i++) {
			java.util.Collections.swap(arr, i, k);
			permute(arr, k + 1);
			java.util.Collections.swap(arr, k, i);
		}

		if (k == arr.size() - 1) {
			String str = "";
			for (int i = 0; i < arr.size(); i++) {
				str = str + arr.toArray()[i];
			}
			lista.add(str);
		}
	}

	@Override
	public String embaralhaPalavra(String palavra) {

		// transforma a palavra em lista de caracteres
		List<Character> pmt = stringToCharList(palavra.toLowerCase());
		// gera uma lista de palavras com a permutação dos caracteres
		permute(pmt, 0);

		// sorteia um palavra da lista e devolve
		Random rand = new Random();
		String randomElement = lista.get(rand.nextInt(lista.size()));

		return randomElement;
	}

}
