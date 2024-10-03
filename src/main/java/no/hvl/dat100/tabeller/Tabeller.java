package no.hvl.dat100.tabeller;

import java.util.Arrays;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		// som kan skrive ut en tabell med heltall. Du kan selv bestemme formatet.
		
		System.out.print("[ ");
		
		for (int tall : tabell) {
			System.out.print(tall + ", ");
		}
		
		System.out.println("]");
			
	}

	// b)
	public static String tilStreng(int[] tabell) {
		

		//som kan returnere en tekststreng (String) med innholdet av en tabell. For en tabell med 
		//elementene 42,67,89 skal følgende streng returneres: "[42,67,89]"
		
		//gir en tabell med mellomrom
//		System.out.println(Arrays.toString(tabell));
//		return (Arrays.toString(tabell));
		
		
		//gir en tabell uten mellomrom
		StringBuilder tabellString = new StringBuilder("[");
		
		for (int i = 0; i < tabell.length; i++) {
			tabellString.append(tabell[i]);
			
			if (i < tabell.length -1) {
				tabellString.append(",");
			}
		}
		
		tabellString.append("]");
		
		return tabellString.toString();
		
	}

	// c)
	public static int summer(int[] tabell) {

		//som gitt en tabell av heltall som parameter beregner summen av tallene som er lagret i tabellen.
		
		int total = 0;  
		
		for (int i = 0; i < tabell.length; i++) {
			
			total += tabell[i];
		}
		System.out.println(total);
		return total;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		//som gitt en tabell og et tall returnerer true om tabellen tabell innholder tallet tall og false ellers.
		
		boolean funnet = false;
		int i = 0;
		
		while (i < tabell.length && (!funnet)) {
			
			if (tabell[i] == tall) {
				funnet = true;
			}
			i++;
		}
		System.out.println(funnet);
		return funnet;


		
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		//som returnerer det første index (posisjon) i tabell som inneholder tallet tall og -1 ellers.
		
		int i = 0;
		int lengde = tabell.length;
		
		while (i < lengde) {
			
			if (tabell[i] == tall) {
				
				return i;

			}			
			i++;
		}
		
		return -1;
	}
	

	// f)
	public static int[] reverser(int[] tabell) {
		
		//som gitt en tabell av heltall returnerer en ny tabell som har de samme elementene som tabell men i modsatt rekkefølge.
		//* Jeg tenker en for løkke som starter på slutten og går oppover
		
		int lengde = tabell.length;
		int[] reverserTabell = new int[lengde];
		
		
		for (int i = 0; i < lengde; i++) {
			
			reverserTabell[i] = tabell[lengde - 1 - i];
			}	
		return reverserTabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		//som kan avgjøre om en tabell av heiltal er sortert stigande (dvs. at alle tal skal vere større enn det forrige)
		//*en if loop som tester om tallet etter er større enn tallet før. må ha en variabel som oppdateres til den forrige verdien.
		
		int lengde = tabell.length;
		
		if (lengde <= 1) {
			return true;
		}

		
		for (int i = 1; i < lengde; i++) {
			if (tabell[i] < tabell[i - 1]) {
				return false;
			}
			
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		
		//som gitt to tabeller tabell1 og tabell2 som parametre, returnerer en ny tabell som er 
		//sammensetning av de to tabellene gitt med som parameter.
		
		int lengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int[lengde];
		
		int i =0, j = 0, k = 0;
		
		while (1 < tabell1.length && j < tabell2.length) {
			nyTabell[k++] = tabell1[i++];
			nyTabell[k++] = tabell2[j++];
		}
		
		while (i < tabell1.length) {
			nyTabell[k++] = tabell1[i++];
		}
		
		while (j < tabell2.length) {
			nyTabell[k++] = tabell2[j++];
		}
		
		return nyTabell;
		
		
		
		
		
	}
}
