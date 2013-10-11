package cit260.project1;
/**
 * @authors William + Jonathan
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
        Marker player1Marker = new Marker();
        player1Marker.displayCharacter();
        Board gameBoard = new Board();
        gameBoard.displayRow();
        Player player1 = new Player();
        System.out.println("\nWe need to know who Player 1 is!");
        player1.getName();
        System.out.println("\nNow for Player 2");
        Player player2 = new Player();
        player2.getName();
   }

    
    public void displayHelp() {
        System.out.println("\nWelcome to Connect Four!" + "\n");
        System.out.println(this.instructions);
 }
    
    
    
}