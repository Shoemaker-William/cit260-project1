/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.project1;

import java.util.Scanner;

/**
 *
 * @author Jonathan Davenport
 */
public class Game {

public void doGame(Player player1, Player player2) {
       boolean win = false;
       Player currentPlayer = player1;
       int turn = 1;
       while(win){
           System.out.println("Please enter which column you'd like to place"
                   + "your piece:");
           int markerPlace = getColumn();
           //There will be a function for the players to put their pieces in
           //This is just to figure if they've won or not.
           if(false){
               //for horizontal
               win = true;
           }
           else if(false){
               //for vertical
               win = true;
           }
           else if(false){
               //for diagonal
               win = true;
           }
           if(currentPlayer == player1){
                currentPlayer = player2;
           }
           else{
                currentPlayer = player1;
           }
           turn++;
       }
       
    }

    void doGame() {
        //As soon as we known how to pass parameters from different classes we will fix this.
    }
     public int getColumn() {

        Scanner inFile = new Scanner(System.in);
        String column = null;
        boolean valid = false;
        while (!valid) {

            column = inFile.nextLine(); //gets input
            if ("1".equals(column) || "2".equals(column) || "3".equals(column)
                    || "4".equals(column) || "5".equals(column) 
                    || "6".equals(column) || "7".equals(column))
                valid = true;
            else {
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
            
        }
        int columnInt = Integer.parseInt(column);
        return columnInt;
    }
}