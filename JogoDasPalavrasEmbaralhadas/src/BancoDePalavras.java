import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {

	public BancoDePalavras() {
		super();
	}

	public String novaPalavra() {

		List<String> lista = new ArrayList<String>();

		try {
			Path currentDir = Paths.get("data");
			File file = new File(currentDir + "/bancoDePalavras.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine())
				lista.add(sc.nextLine());
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// sorteia um palavra da lista e devolve
		Random rand = new Random();
		String randomElement = lista.get(rand.nextInt(lista.size()));

		return randomElement;

	}

	public static void main(String[] args) {

		BancoDePalavras bancoPal = new BancoDePalavras();
		System.out.println(bancoPal.novaPalavra());

	}
}
