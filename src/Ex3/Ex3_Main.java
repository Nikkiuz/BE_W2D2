package Ex3;

import java.util.HashMap;

public class Ex3_Main {
	public static void main(String[] args) {
		HashMap<String, String> persone = new HashMap<String, String>();
		Ex3.aggiungi_elemento("Francois", "12345", persone);
		Ex3.aggiungi_elemento("Niccolò", "6789", persone);
		Ex3.aggiungi_elemento("MartinoSempreBello", "2345", persone);
		Ex3.aggiungi_elemento("Tommaso", "56785", persone);

		Ex3.elimina_tramite_nome("Francois", persone);

		System.out.println("Ricerca tramite il numero '6789' : ");
		Ex3.ricerca_persona_tramite_numero("6789", persone);

		System.out.println("Ricerca tramite nome 'MartinoSempreBello' : ");
		Ex3.ricerca_persona_tramite_nome("MartinoSempreBello", persone);

		System.out.println("Lista Chiavi / Valore : \n");
		Ex3.stampa_tutti_i_contatti(persone);

	}

}

