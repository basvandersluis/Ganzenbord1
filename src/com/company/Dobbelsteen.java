package com.company;

import java.util.Random;

public class Dobbelsteen {
    int gooien() {
        Random random = new Random();

        laatsteWorp = random.nextInt(6) + 1;

        return laatsteWorp;

    }
    int laatsteWorp;


}
