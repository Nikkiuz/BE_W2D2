package Ex2;

import java.util.*;

public class Ex2 {
	public static void Esercizio2() {
		Scanner myScanner2 = new Scanner(System.in);
		System.out.println("Inserisci un numero per generare un numero pari di interi casuali");
		int N = myScanner2.nextInt();

		List<Integer> interiRandom = new ArrayList<Integer>();
		Random random = new Random();

		for (int i = 0; i < N; i++) {
			interiRandom.add(random.nextInt(1, 101));
		}
		System.out.println(interiRandom);
		List<Integer> listaReverse = Reverse(interiRandom);
		System.out.println(listaReverse);
		printPosition(interiRandom, true);

	}


	public static List<Integer> Reverse(List<Integer> interiRandom) {
		List<Integer> listaReverse = new ArrayList<Integer>();
		listaReverse.addAll(interiRandom);
		List<Integer> copiaLista = new ArrayList<Integer>(interiRandom);
		Collections.reverse(copiaLista);
		listaReverse.addAll(copiaLista);
		return listaReverse;

	}

	public static void printPosition(List<Integer> interiRandom, boolean x) {
		for (int i = 0; i < interiRandom.size(); i++) {
			if (i % 2 == 0 && x) {
				System.out.println("il numero in posizione pari è " + interiRandom.get(i));
			} else if (i % 2 != 0 && !x) {
				System.out.println("il numero in posizione dispari è " + interiRandom.get(i));
			}

		}
	}
}
