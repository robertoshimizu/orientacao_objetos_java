import java.util.ArrayList;
import java.util.List;

public class BaralhoTrocaLetrasImparesPorPares implements Embaralhador {

	private List<Character> stringToCharList(String str) {
		List<Character> list = new ArrayList<Character>();
		for (char ch : str.toCharArray()) {
			list.add(ch);
		}
		return list;
	}

	@Override
	public String embaralhaPalavra(String palavra) {
		// transforma a palavra em lista de caracteres
		List<Character> arr = stringToCharList(palavra.toLowerCase());

		for (int i = 1; i < arr.size(); i++) {
			int k = i - 1;
			java.util.Collections.swap(arr, i, k);
			i = i + 1;
		}

		String str = "";
		for (int i = 0; i < arr.size(); i++) {
			str = str + arr.toArray()[i];
		}

		return str;
	}

}
