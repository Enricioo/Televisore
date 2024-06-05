package org.generation.italy.model;

public class Televisore {

	// Dichiarazione variabili
	private String marca;
	private String modello;
	private int nrPollici;
	private boolean stato;
	private int volume;
	private boolean modalitaHotel;
	private String[] elencoCanali;
	private int canaleCorrente;
	private boolean cambiaCanale;
	
	
	public Televisore (String marca, String modello, int nrPollici, boolean modalitaHotel) {
		// Inizializzazione attributi
		this.marca = marca;
		this.modello = modello;
		this.nrPollici = nrPollici;
		this.stato = false;
		this.volume = 0;
		this.modalitaHotel = false;
		this.canaleCorrente = 0;
		this.elencoCanali = new String[] 
				{"Rai 1", "Rai 2", "Rai 3", "Rai 4", "Canale 5", "Italia 1", "La7", "TV8", "NOVE", "Italia 2"};
	}
	
	
	public String getMarca() {
		return marca;
	}
	
	
	// Metodo per l'accensione e lo spegnimento
	
	public boolean isStato() {
		return stato;
	}
	
	public void accendi() {
		this.stato = true;
		this.canaleCorrente = 1;
	}
	
	public void spegni() {
		this.stato = false;
	}

	// Metodi per volume
	public int getVolume() {
		return volume;
	}
	
	public void aumentaVolume() {
		if (modalitaHotel && volume > 5) {
			this.volume = 5;
		} else if (volume < 0 ) {
			this.volume = 0;
		}  
		this.volume++;
	}	
	
	
	public void diminuisciVolume() {
			if (modalitaHotel && volume > 5) {
				this.volume = 5;
			} else if (volume < 0 ) {
				this.volume = 0;
			}  
			this.volume--;	
	}
	
	// Metodi per i canali
	public String[] getElencoCanali() {
		return elencoCanali;
	}
	
	public void cambiaCanale(int canale) {
		if (canale >= 0 && canale <= this.elencoCanali.length) {
			System.out.println("Cambiando il canale: " + this.elencoCanali[canale]);
			this.canaleCorrente = (canale);
		}
		
	}

	@Override
	public String toString() {
		return "Televisore [marca=" + marca + ", modello=" + modello + ", nrPollici=" + nrPollici + ", stato=" + stato
				+ ", volume=" + volume + ", modalitaHotel=" + modalitaHotel + "]";
	}
	
}
