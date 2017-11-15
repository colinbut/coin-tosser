/*
 * |-------------------------------------------------
 * | Copyright © 2017 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.coin.tosser;

public enum Coin {
    HEADS("HEADS"),
    TAILS("TAILS");

    Coin(String side) {
        this.side = side;
    }

    private String side;
}
