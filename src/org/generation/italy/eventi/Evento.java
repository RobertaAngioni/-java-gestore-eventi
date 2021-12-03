package org.generation.italy.eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {
	
	//attributi
	private String title;
	private LocalDate date;
	private int postiTotale;
	private int postiPrenotati;
	
	//costruttore
	
	
	public Evento(String title, LocalDate date, int postiTotale) throws Exception {
		
		if(postiTotale > 0) {
			this.postiTotale = postiTotale;
		}else {
			throw new Exception ("Il valore dev'essere positivo");
		}
		
		if(date.isAfter(LocalDate.now())) {
			this.date = date;
		}else {
			throw new Exception ("La data è precedente a quella odierna");
		}
		
		this.title = title;
		this.postiPrenotati = 0;
	}
	
	//getter and setter


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	
    public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public int getPostiTotale() {
		return postiTotale;
	}


	public int getPostiPrenotati() {
		return postiPrenotati;
	}

	
	//metodi
	
	public void prenota() throws Exception{
		if(!date.isBefore(LocalDate.now())) {
			throw new Exception ("La data non è valida");
		}else if (postiPrenotati == postiTotale) {
			throw new Exception ("Non ci sono posti prenotabili");
		}else {
			postiPrenotati++;
		}
		
	}
	
	public void disdici() throws Exception {
		if(!date.isBefore(LocalDate.now()))  {
			throw new Exception ("La data non è valida");
		}else if (postiPrenotati == 0) {
			throw new Exception ("Non ci sono posti pèrenotati");
		}else {
			postiPrenotati--;
		}
		
	}

	@Override
	public String toString() {
		String dataFormattata;
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy");
		dataFormattata = this.date.format(df);
		return dataFormattata + " - " + this.title;
	}
	
    
		
	}


