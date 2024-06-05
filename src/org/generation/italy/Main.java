package org.generation.italy;
import org.generation.italy.model.Televisore;


import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String marca, modello;
		int scelta = 0;
		Televisore tv;
		int nrPollici;
		
	do {
		System.out.println("Menù");
		scelta = sc.nextInt();
		sc.nextLine();
		switch (scelta) {
		
		case(1): 
			System.out.println("Inserisci la marca: ");
			marca = sc.nextLine();
			System.out.println("Inserisci modello: ");
			modello = sc.nextLine();
			System.out.println("Inserisci numero pollici: ");
			nrPollici = sc.nextInt();
			System.out.println("Inserire la modalità hotel? Y/N");
			boolean modalitaHotel = sc.nextBoolean();
			sc.nextLine();
			
		case(2):
			tv.accendi();
			System.out.println("Stato tv: " + tv.isStato());
		case(3):
		
		}
		
		
	} while (scelta == 9);
		
		
	}

}
