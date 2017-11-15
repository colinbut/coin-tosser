package com.mycompany.coin.tosser;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoinTosser {

    private static final double MEDIAN = 0.5;

    public static void main(String[] args) {

        CoinTosser coinTosser = new CoinTosser();
        int rounds = Integer.parseInt(args[0]);

        for (int i = 0; i < rounds; i++) {
            coinTosser.toss();
        }
    }

    public void toss() {
        String tossMessage = "Tossed the coin and it came: {}";
        if (Math.random() < MEDIAN) {
            log.info(tossMessage, Coin.HEADS);
        } else {
            log.info(tossMessage, Coin.TAILS);
        }
    }

}
