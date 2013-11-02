package cit260.project1;
import java.util.Scanner;
/*
 * @author Jonathan Davenport
 */
public class Game {
public void doGame(Player player1, Player player2) {
       boolean win = false;
       Player currentPlayer = player1;
       int turn = 0;
       while(win){
           turn++;
           Board gameBoard = new Board();
           gameBoard.displayBoard();
           System.out.println("Please enter which column you'd like to place"
                   + "your piece:");
           int markerPlace = getColumn();
           placeMarker(markerPlace, Board.allMarkers);
           gameBoard.displayBoard();
           win = testHorizontal(Board.allMarkers);
           
           if(!win){
               win = testVertical(Board.allMarkers);
           }
           else if(!win){
               win = testDiagonal(Board.allMarkers);
           }
           if(!win) {
               if(currentPlayer == player1){
                   currentPlayer = player2;
               }
               else{
                  currentPlayer = player1;
               }
           }    
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

    private void placeMarker(int markerPlace, String[][] allMarkers) {
        for (int i = 6; i >= 0; i--){
                  if("X".equals(Board.allMarkers[i][markerPlace])) {
                      Board.allMarkers[i][markerPlace] = "O";
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
        for (int i = 6; i >= 4; i--) {
            for (int j = 0; j < 7; j++) {
                if ("X".equals(allMarkers[i][j])) {}
                else  {
                    if (allMarkers[i][j].equals(allMarkers[i+1][j]) && 
                        allMarkers[i][j].equals(allMarkers[i+2][j]) &&
                        allMarkers[i][j].equals(allMarkers[i+3][j]))
                        return true;        
                }  
            }
        }
        return false;
    }
    private boolean testDiagonal(String[][] allMarkers) {
        for (int i = 6; i >= 4; i--) {
            for (int j = 0; j < 4; j++) {
                if ("X".equals(allMarkers[i][j])) {}
                else  {
                    if (allMarkers[i][j].equals(allMarkers[i+1][j+1]) && 
                           allMarkers[i][j].equals(allMarkers[i+2][j+2]) &&
                            allMarkers[i][j].equals(allMarkers[i+3][j+3]))
                        return true;
                    
                }  
            }
            for (int j = 6; j >= 3; j--) {
                if ("X".equals(allMarkers[i][j])) {}
                else  {
                    if (allMarkers[i][j].equals(allMarkers[i+1][j-1]) && 
                           allMarkers[i][j].equals(allMarkers[i+2][j-2]) &&
                            allMarkers[i][j].equals(allMarkers[i+3][j-3]))
                        return true;
                    
                }  
            }
        }
        return false;
    }
}
