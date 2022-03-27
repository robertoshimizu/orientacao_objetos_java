import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Permute {
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

	public String generate(String palavra) {

		List<Character> pmt = stringToCharList(palavra);
		permute(pmt, 0);

		Random rand = new Random();
		String randomElement = lista.get(rand.nextInt(lista.size()));

		return randomElement;

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

	public static void main(String[] args) {

		Permute permute = new Permute();

		System.out.println("Resultado " + permute.generate("uva"));
		System.out.println("Lista " + permute.getLista());

	}

}
