/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deliverable1;

/**
 *
 * @author TeamReva
 */
import java.util.List;

public abstract class Game {
    private String name;
    protected List<Player> players;

    public Game(String name) {
        this.name = name;
    }

    public abstract void play();

    public String getName() {
        return name;
    }
}
