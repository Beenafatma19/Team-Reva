 package Deliverable1.project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author bsp18
 */

import java.util.Scanner;
public class Main{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player 1 name: ");
        String player1Name = scanner.nextLine();

        System.out.print("Enter Player 2 name: ");
        String player2Name = scanner.nextLine();

        WarGame wargame = new WarGame("War Card Game", player1Name, player2Name);
        wargame.play();
    }
}
