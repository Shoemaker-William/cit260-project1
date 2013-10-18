/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.project1;

/**
 *
 * @author Jonathan Davenport
 */
public class Game {

public void doGame(Player player1, Player player2) {
       boolean win = false;
       Player currentPlayer = player1;
       while(win){
           int turn = 1;
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
}