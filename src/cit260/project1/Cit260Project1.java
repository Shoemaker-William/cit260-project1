package cit260.project1;

import java.util.Scanner;

/**
 *
 * @authors William + Jonathan
 * 
 */
public class Cit260Project1 {
    
    String name;
    String instructions = "This is the game of Connect Four. It involves two\n"
            + "players. Each player takes a turn putting a marker in the\n"
            + "bottom empty space of a column. When a player gets four markers\n"
            + "in a row, either horizontal, vertical, or diagonal; that\n"
            + "player wins the game.";
    public static void main(String[] args) {
        Cit260Project1 myGame = new Cit260Project1();
        myGame.displayHelp();
        myGame.getName();
        Marker player1Marker = new Marker();
        player1Marker.displayCharacter();
        Board gameBoard = new Board();
        gameBoard.displayRow();
        Player player1 = new Player();
        player1.displayName();
        Player player2 = new Player();
        player2.displayName();
    }
    public void getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter your name, then press enter to get started: ");
        this.name = input.next();
    }
    public void displayHelp() {
        //System.out.println("\nWelcome" + this.name + "\n");
        System.out.println("\nWelcome to Connect Four!" + "\n");
        System.out.println(this.instructions);
    }
    }
    
