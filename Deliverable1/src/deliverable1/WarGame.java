/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deliverable1;

/**
 *
 * @author TeamReva
 */


import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class WarGame extends Game {
    private Deck deck;

    public WarGame(String name, String player1, String player2) {
        super(name);
        players = List.of(new Player(player1), new Player(player2));
        deck = new Deck();
        deck.shuffle();
        distributeCards();
    }

    private void distributeCards() {
        for (int i = 0; i < 26; i++) {
            players.get(0).addCard(deck.drawCard());
            players.get(1).addCard(deck.drawCard());
        }
    }

    @Override
    public void play() {
        System.out.println("Starting War Game...");
        while (!players.get(0).isOutOfCards() && !players.get(1).isOutOfCards()) {
            Card card1 = players.get(0).playCard();
            Card card2 = players.get(1).playCard();

            System.out.println(players.get(0).getName() + " plays: " + card1);
            System.out.println(players.get(1).getName() + " plays: " + card2);

            if (card1.getValue() > card2.getValue()) {
                players.get(0).addCard(card1);
                players.get(0).addCard(card2);
                System.out.println(players.get(0).getName() + " wins this round!\n");
            } else if (card2.getValue() > card1.getValue()) {
                players.get(1).addCard(card1);
                players.get(1).addCard(card2);
                System.out.println(players.get(1).getName() + " wins this round!\n");
            } else {
                System.out.println("It's a tie! War happens!\n");
            }
        }

        if (players.get(0).isOutOfCards()) {
            System.out.println(players.get(1).getName() + " wins the game!");
        } else {
            System.out.println(players.get(0).getName() + " wins the game!");
        }
    }
}
