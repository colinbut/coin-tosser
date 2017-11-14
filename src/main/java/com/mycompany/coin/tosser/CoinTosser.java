package com.mycompany.coin.tosser;

public class CoinTosser {

    public static void main(String[] args) {

        int rounds = Integer.parseInt(args[0]);

        for (int i = 0; i < rounds; i++) {
            if (Math.random() < 0.5) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
        }

    }

}
