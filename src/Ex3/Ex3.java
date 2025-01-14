package Ex3;

import java.util.*;

public class Ex3 {

	public static void aggiungi_elemento(String Nome, String Telefono, HashMap<String, String> persone) {
		persone.put(Nome, Telefono);
	}

	public static void elimina_tramite_nome(String nome_da_eliminare, HashMap<String, String> persone) {
		if (persone.containsKey(nome_da_eliminare)) {
			persone.remove(nome_da_eliminare);
		}
	}

	public static void ricerca_persona_tramite_numero(String num_tel, HashMap<String, String> persone) {

		for (String nome : persone.keySet()) {
			if (persone.get(nome).equals(num_tel)) {
				System.out.println("Il numero di telefono appartiene a: " + nome + "\n");
			}
		}
	}

	public static void ricerca_persona_tramite_nome(String nome, HashMap<String, String> persone) {
		System.out.println("Il numero di telefono di " + nome + "e' = " + persone.get(nome) + '\n');
	}

	public static void stampa_tutti_i_contatti(HashMap<String, String> persone) {

		for (String i : persone.keySet()) {
			System.out.println("key: " + i + " value: " + persone.get(i));
		}

	}

}
