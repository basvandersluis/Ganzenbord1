package com.company;

import java.util.Scanner;

public class Spel {
    String input;
    int plaatsNummer = 1;
    boolean gameStatus = true;
    static int a;

    public void gameLoop(Dobbelsteen dobbelsteen) {
        while (gameStatus == true) {
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();

            if (input.toLowerCase().equals("g")) {
                plaatsNummer = plaatsNummer + dobbelsteen.gooien();
                controleerPlaats(dobbelsteen);
            } else {
                System.out.println("De input is onjuist. Type g om de dobbelsteen te gooien");
            }
        }
    }
    public void controleerPlaats(Dobbelsteen dobbelsteen) {
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
            System.out.println("Ga " + dobbelsteen.laatsteWorp + " stappen verder!");
            plaatsNummer += dobbelsteen.laatsteWorp;

            if(plaatsNummer >= 63) {
                gameWinnaar();
            }

            System.out.println("Je staat nu op " + plaatsNummer);
        } else {
            System.out.println("Je staat nu op " + plaatsNummer + ". Je staat veilig!");
        }

    }
     void gameWinnaar() {
        if(plaatsNummer == 63) {
            System.out.println("Je staat op 63. Je hebt gewonnen!");
        } else {
            System.out.println("Je bent plaats 63 gepasseerd. Je hebt gewonnen!");
        }
        plaatsNummer = 0;

//        spelUitleg();
    }

     void gameOver() {
        System.out.println("Helaas, je hebt verloren!");
    }

}
