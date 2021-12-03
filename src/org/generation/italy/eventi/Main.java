package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Inserisci evento: ");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci nome dell'evento: ");
		String titolo= scan.nextLine();
		System.out.print("Inserisci giorno dell'evento: ");
		int giorno = scan.nextInt();
		System.out.print("Inserisci mese dell'evento: ");
		int mese = scan.nextInt();
		System.out.print("Inserire l'anno dell'evento: ");
		int anno = scan.nextInt();
		LocalDate dataEvento = LocalDate.of(anno, mese, giorno);
		System.out.println("La data è: " + dataEvento);
		System.out.print("Inserisci numero di posti totali: ");
		int postiTotali = scan.nextInt();
//		System.out.print("Inserisci numero di posti che vuoi prenotare: ");
//		int postiPrenotati = scan.nextInt();
		
		//evento
		try {
			Evento evento = new Evento(titolo, dataEvento, anno);
			System.out.println("Hai creato l'evento " + titolo.toUpperCase() + "il " + dataEvento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("vuoi fare una prenotazione? s/n");
		
		
		
		
		
		
		scan.close();

	}

}
