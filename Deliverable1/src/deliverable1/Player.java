/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deliverable1;

/**
 *
 * @author TeamReva
 */

import java.util.LinkedList;
import java.util.Queue;

public class Player {
    private String name;
    private Queue<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        return hand.poll();
    }

    public boolean isOutOfCards() {
        return hand.isEmpty();
    }
}
