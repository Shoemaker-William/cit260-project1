package cit260.project1;
/* @author Jonathan Davenport + Will Shoemaker
 */
public class Board {
    int row = 6;
    int column = 7;
    public static String[][]allMarkers ={
        {"X","X","X","X","X","X","X"},
        {"X","X","X","X","X","X","X"},
        {"X","X","X","X","X","X","X"},
        {"X","X","X","X","X","X","X"},
        {"X","X","X","X","X","X","X"},
        {"X","X","X","X","X","X","X"},
        {"1","2","3","4","5","6","7"}
    };
public void displayBoard() {
              for (int i = 0; i < Board.allMarkers.length; i++){
                  for (int j = 0; j < Board.allMarkers[i].length; j++) {
                      String currentMarker;
                      if ("X".equals(allMarkers[i][j])) {
                          currentMarker = " ";
                      }
                      else {
                          currentMarker = allMarkers[i][j];
                      }
                      if (i < 6){
                          System.out.print("|" + currentMarker);
                      }
                      else {
                          System.out.print(" " + currentMarker);
                      }
                  }
                  if (i < 6){
                      System.out.print("|\n");
                  }
              }
        }
public void clearBoard() {
    for (int i = 0; i < 6; i++){
         for (int j = 0; j < Board.allMarkers[i].length; j++) {
             allMarkers[i][j]= "X";
         }
    }
}
}