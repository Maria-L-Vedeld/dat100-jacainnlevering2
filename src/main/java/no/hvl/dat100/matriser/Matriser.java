package no.hvl.dat100.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		// som kan skrive ut en matrise. Prøv å bruke to (nøstede) utvidede for-løkker
		// (se avsnitt 5.6 i boken for beskrivelse av utvidet for-løkke).
		for (int i = 0; i < matrise.length; i++) {
			System.out.println();
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		/*
		 * som returnerer en streng-representation av en matrise. Om matrisen er
		 * følgende: 1 2 3 \n4 5 6 \n7 8 9 \n
		 * 
		 * da skal strengen som returneres ha følgende innhold: 1 2 3 \n4 5 6 \n7 8 9 \n
		 */
		StringBuilder matriseString = new StringBuilder();

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseString.append(matrise[i][j]);
				if (j < matrise[i].length - 1) {
					matriseString.append(" ");
				}
			}
			
			matriseString.append("\n");
		}
		return matriseString.toString();

	}

	

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// som returnerer en ny matrise der alle tall i matrisen er multiplisert med
		// parameteren tall. Metoden må først opprette en ny matrise (fler-dimensjonell
		// tabell) som er like stor som parameteren og så multiplisere alle elementer
		// med tall

		int rader = matrise.length;
		int kolonner = matrise[0].length;

		int[][] nyMatrise = new int[rader][kolonner];

		for (int i = 0; i < rader; i++) {
			for (int j = 0; j < kolonner; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		
		// som avgjør om to matriser gitt ved parametrene a og b er like.
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i].length != b[i].length) {
				return false;
			}
		}
		for (int k = 0; k < a.length; k++) {
			for (int j = 0; j < a[k].length; j++) {
				if (a[k][j] != b[k][j]) {
					return false;
				}
			}
		}
		return true;
		
		}
	}


// e) EKSTRAOPPGAVE 6A
//	public static int[][] speile(int[][] matrise) {

// TODO

// throw new UnsupportedOperationException("Metoden speile ikke implementert");

//	}

// f) EKSTRAOPPGAVA 6B
//	public static int[][] multipliser(int[][] a, int[][] b) {

// TODO
// throw new UnsupportedOperationException("Metoden multipliser ikke
// implementert");

//	}
//}
