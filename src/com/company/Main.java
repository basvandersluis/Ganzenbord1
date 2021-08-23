package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int plaatsNummer  = 1;
    static int a;
    static boolean gameStatus = true;
    static String input;
	static Spel spel;

    public static void main(String[] args) {
	System.out.println("Welkom bij Ganzenbord! Je staat op start. Gooi je dobbelsteen (g):");

	Dobbelsteen dobbelsteen = new Dobbelsteen();

	Spel jojo = new Spel();

	Speler speler = new Speler();
	spelUitleg();
	jojo.gameLoop(dobbelsteen);


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





//	static void gameWinnaar() {
//		if(plaatsNummer == 63) {
//			System.out.println("Je staat op 63. Je hebt gewonnen!");
//		} else {
//			System.out.println("Je bent plaats 63 gepasseerd. Je hebt gewonnen!");
//		}
//		plaatsNummer = 0;
//
//		spelUitleg();
//		}
//
//	static void gameOver() {
//		System.out.println("Helaas, je hebt verloren!");
//		}
    }

