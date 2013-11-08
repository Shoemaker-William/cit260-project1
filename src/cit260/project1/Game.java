package cit260.project1;
import java.util.Scanner;
/*
 * @author Jonathan Davenport + William Shoemaker
 */
public class Game {
public void doGame() {
       Player player1 = new Player();
       System.out.println("\nWe need to know who Player 1 is!");
       player1.getName();
       player1.marker = "1";
       System.out.println("\nNow for Player 2");
       Player player2 = new Player();
       player2.getName();
       player2.marker = "2";
       Board gameBoard = new Board();
       boolean win = false;
       int turn = 0;
       while(!win){
           turn++;
           Player currentPlayer;
           if((turn % 2)==1) {
               currentPlayer = player1;
           }
           else {
               currentPlayer = player2;
           }
           gameBoard.displayBoard();
           System.out.println("\n" + currentPlayer.name + ", Please enter which column you'd like to place"
                   + " your piece:");
           int markerPlace = getColumn();
           placeMarker(markerPlace, Board.allMarkers, currentPlayer);
           win = testHorizontal(Board.allMarkers);
           if(!win){
               win = testVertical(Board.allMarkers);
           }
           else if(!win){
               win = testDiagonal(Board.allMarkers);
           }
           if(win) {
               currentPlayer.score++;
               currentPlayer.wins++;
           }
       }
       gameBoard.clearBoard();
       displayScore(player1, player2);
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
        int columnInt = Integer.parseInt(column)-1;
        return columnInt;
    }

    private void placeMarker(int markerPlace, String[][] allMarkers, Player currentPlayer) {
        for (int i = 6; i >= 0; i--){
                  if("X".equals(Board.allMarkers[i][markerPlace])) {
                      Board.allMarkers[i][markerPlace] = currentPlayer.marker;
                      return;
                      //"O" should be changed to fit with whatever player placed the marker
                      //This would be better if we could pass the current player in as well
                      //This won't work until we can get the function doGame to work
            }
        }
    }
    private boolean testHorizontal(String[][] allMarkers) {
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                if ("X".equals(allMarkers[i][j])) {}
                else  {
                    if (allMarkers[i][j].equals(allMarkers[i][j+1]) && 
                           allMarkers[i][j].equals(allMarkers[i][j+2]) &&
                            allMarkers[i][j].equals(allMarkers[i][j+3]))
                        return true;
                }  
            }
        }
        return false;
    }
    private boolean testVertical(String[][] allMarkers) {
        for (int i = 5; i >= 3; i--) {
            for (int j = 0; j <= 6; j++) {
                if ("X".equals(allMarkers[i][j])) {}
                else  {
                    if (allMarkers[i][j].equals(allMarkers[i-1][j]) && 
                        allMarkers[i][j].equals(allMarkers[i-2][j]) &&
                        allMarkers[i][j].equals(allMarkers[i-3][j]))
                        return true;        
                }  
            }
        }
        return false;
    }
    private boolean testDiagonal(String[][] allMarkers) {//This doesn't work yet
        for (int i = 5; i >= 3; i--) {
            for (int j = 0; j < 4; j++) {
                if ("X".equals(allMarkers[i][j])) {}
                else  {
                    if (allMarkers[i][j].equals(allMarkers[i-1][j+1]) && 
                           allMarkers[i][j].equals(allMarkers[i-2][j+2]) &&
                            allMarkers[i][j].equals(allMarkers[i-3][j+3]))
                        return true;
                }  
            }
            for (int j = 3; j < 7; j++) {
                if ("X".equals(allMarkers[i][j])) {}
                else  {
                    if (allMarkers[i][j].equals(allMarkers[i-1][j-1]) && 
                           allMarkers[i][j].equals(allMarkers[i-2][j-2]) &&
                            allMarkers[i][j].equals(allMarkers[i-3][j-3]))
                        return true;
                }  
            }
        }
        return false;
    }
public void displayScore(Player player1, Player player2) {
    System.out.println("\n\n");
        System.out.println(player1.name + ", your score is " + player1.score + ". You have won " + player1.wins + " games.");
        System.out.println(player2.name + ", your score is " + player2.score + ". You have won " + player2.wins + " games.");
        System.out.println("\n\n");
        if (player1.score > player2.score) {
            player1.score = player1.score + 1;
            player2.score = player2.score - 1;
            player1.wins = player1.wins + 1;
            player2.losses = player2.losses - 1;
            System.out.println(player1.name + " is the winner of this round! Great work!");
        }
        else if (player2.score > player1.score) {
            player2.score = player2.score + 1;
            player1.score = player1.score - 1;
            player2.wins = player2.wins + 1;
            player1.losses = player1.losses - 1;
            System.out.println(player2.name + " is the winner of this round! Great work!");
        }
        else if (player1.score == player2.score) {
            System.out.println("It was a tie! You both win this round! Or lose...");
        }
    }
}
