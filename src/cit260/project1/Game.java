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
       player1.marker = "X";
       System.out.println("\nNow for Player 2");
       Player player2 = new Player();
       player2.getName();
       player2.marker = "O";
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
                   + " an " + currentPlayer.marker + ":");
           int markerPlace = getColumn();
           placeMarker(markerPlace, Board.allMarkers, currentPlayer);
           win = testHorizontal(Board.allMarkers);
           if(!win){
               win = testVertical(Board.allMarkers);
           }
           if(!win){
               win = testDiagonal(Board.allMarkers);
           }
           if(win) {
               currentPlayer.score++;
               currentPlayer.wins++;
           }
       }
       gameBoard.displayBoard();
       gameBoard.clearBoard();
       
       Player.displayScore(player1, player2);
       //This should run the displayScore method that is not in the Player class. 
      

}
     private int getColumn() {
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
                  if("_".equals(Board.allMarkers[i][markerPlace])) {
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
                if ("_".equals(allMarkers[i][j])) {}
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
                if ("_".equals(allMarkers[i][j])) {}
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
    private boolean testDiagonal(String[][] allMarkers) {
        for (int i = 5; i >= 3; i--) {
            for (int j = 0; j < 7; j++) {
                if ("_".equals(allMarkers[i][j])) {}
                else if(j <= 3)  {
                    if(allMarkers[i][j].equals(allMarkers[i-1][j+1]) && 
                           allMarkers[i][j].equals(allMarkers[i-2][j+2]) &&
                            allMarkers[i][j].equals(allMarkers[i-3][j+3]))
                        return true;
                }  
                else if(j >= 3) {
                    if(allMarkers[i][j].equals(allMarkers[i-1][j-1]) && 
                           allMarkers[i][j].equals(allMarkers[i-2][j-2]) &&
                            allMarkers[i][j].equals(allMarkers[i-3][j-3]))
                        return true;
                }
            }
        }
        return false;
    }
}