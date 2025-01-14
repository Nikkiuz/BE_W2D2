package Ex1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {
	public static void Esercizio1() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Inserisci un valore intero per settare il numero di elementi");
		int N = myScanner.nextInt();
		myScanner.nextLine();

		System.out.println("Inserisci un numero di parole pari al valore inserito in precedenza");
		Set<String> parole = new HashSet<String>();
		Set<String> duplicati = new HashSet<String>();

		for (int i = 0; i < N; i++) {
			String parola = myScanner.nextLine();

			if (parole.contains(parola)) {
				System.out.println("Attenzione hai inserito più volte " + parola);
				duplicati.add(parola);
			}
			parole.add(parola);
			}


		System.out.println("hai inserito " +parole.size()+ " parole");
		System.out.println(parole);
		System.out.println(duplicati);

	}
}

