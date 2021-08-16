package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int plaatsNummer  = 1;
    static int a;
    static boolean gameStatus = true;
    static String input;

    public static void main(String[] args) {
	System.out.println("Welkom bij Ganzenbord! Je staat op start. Gooi je dobbelsteen (g):");

	spelUitleg();

	while(gameStatus == true) {
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();

		if (input.toLowerCase().equals("g")) {
			gooiDobbelsteen();
			controleerPlaats();
		} else {
			System.out.println("De input is onjuist. Type g om de dobbelsteen te gooien");
		}
	}
    }

	static void spelUitleg() {
		System.out.println("---------------------------------"
		+ "\nGooi de dobbelsteen door op g te klikken."
		+ "\nZet het aantal stappen dat je hebt gegooid met de dobbelsteen."
		+ "\nPas op, onderweg kom je spannende obstakels tegen!"
		+ "\nKom je op plaats 23 terecht, dan kom je in de gevangenis en is het spel over!"
		+ "\nAls je op plaats 25 of 45 komt ga je terug naar start en begin je opnieuw!"
		+ "\nWanneer je op plaats 10, 20, 30, 40, 50 of 60 terecht komt mag je het geworpen aantal nog een keer lopen!"
		+ "\nPlaats 63 is de finish. Zodra je hier op of voorbij komt heb je gewonnen!"
		+ "\n---------------------------------");
		}

	static void gooiDobbelsteen() {
		Random random = new Random();
		a = random.nextInt(6) + 1;
		plaatsNummer += a;
		}

	static void controleerPlaats() {
		if(plaatsNummer == 23) {
			System.out.println("Je staat op " + plaatsNummer + ". De gevangenis. Game over!");
			gameOver();
			gameStatus = false;
		} else if (plaatsNummer >= 63) {
			gameWinnaar();
		} else if(plaatsNummer == 25 || plaatsNummer == 45) {
			System.out.println("Helaas! Je bent terecht gekomen op " + plaatsNummer + ". Je begint weer vanaf start.");
			plaatsNummer = 1;
		} else if ((plaatsNummer % 10)== 0) {
			switch(plaatsNummer) {
				case 10:
					System.out.println("Je staat op 10!");
					break;
				case 20:
					System.out.println("Je staat op 20!");
					break;
				case 30:
					System.out.println("Je staat op 30!");
					break;
				case 40:
					System.out.println("Je staat op 40!");
					break;
				case 50:
					System.out.println("Je staat op 50!");
					break;
				case 60:
					System.out.println("Je staat op 60!");
					break;
			}
			System.out.println("Ga " + a + " stappen verder!");
			plaatsNummer += a;

			if(plaatsNummer >= 63) {
				gameWinnaar();
			}

			System.out.println("Je staat nu op " + plaatsNummer);
		} else {
			System.out.println("Je staat nu op " + plaatsNummer + ". Je staat veilig!");
		}

		}

	static void gameWinnaar() {
		if(plaatsNummer == 63) {
			System.out.println("Je staat op 63. Je hebt gewonnen!");
		} else {
			System.out.println("Je bent plaats 63 gepasseerd. Je hebt gewonnen!");
		}
		plaatsNummer = 0;

		spelUitleg();
		}

	static void gameOver() {
		System.out.println("Helaas, je hebt verloren!");
		}
    }

