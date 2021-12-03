package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Inserisci evento: ");
		
		
		System.out.print("Inserisci nome dell'evento: ");
		String titolo= scan.nextLine();
		
		System.out.print("Inserisci giorno dell'evento: ");
		int giorno = scan.nextInt();
		System.out.print("Inserisci mese dell'evento: ");
		int mese = scan.nextInt();
		System.out.print("Inserire l'anno dell'evento: ");
		int anno = scan.nextInt();
		LocalDate dataEvento = LocalDate.of(anno, mese, giorno);
		System.out.println("La data è: " + dataEvento.toString());
		

		
		//evento
		try {
			Evento evento = new Evento(titolo, dataEvento, anno);
			
			System.out.print("Inserisci numero di posti totali: ");
			int postiTotali = scan.nextInt();
			
			String scelta;
			boolean valido = false;
			String disdetta;
			boolean disdettaValida = false;
			System.out.println("Vuoi prenotare? s/n");
			scan.nextLine();
			do {
				scelta = scan.nextLine();
				if(scelta.equals("n")) {
					System.out.println("Arrivederci.");
					valido = true;
					break;
				}
		
			System.out.print("Inserisci il numero di posti che vuoi prenotare: ");
			int postiDaPrenotare = scan.nextInt();
			for(int i = 0; i < postiDaPrenotare; i++) {
				evento.prenota();
				
			}
			System.out.println("I posti prenotati sono: " + postiDaPrenotare + " e quelli disponibili sono: " + (postiTotali - postiDaPrenotare));
			
			System.out.println("Vuoi disdire? s/n");
			scan.nextLine();
			disdetta = scan.nextLine();
			if(scelta.equals("n")) {
				System.out.println("Arrivederci.");
				disdettaValida = true;
				break;
			}
			System.out.print("Inserisci il numero di posti che vuoi disdire: ");
			int postiDaDisdire = scan.nextInt();
			for(int i = 0; i < postiDaDisdire; i++) {
				evento.prenota();
				
			}
			System.out.println("I posti prenotati sono: " + (postiDaPrenotare - postiDaDisdire)  + " e quelli disponibili sono: " + (postiTotali - (postiDaPrenotare - postiDaDisdire)));
					break;
			}while(valido == false);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
			

		
		
            
	  
		
		
		
		
		scan.close();

	
	}
}
	

