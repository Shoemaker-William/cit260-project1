package cit260.project1;
/**
 * @authors William + Jonathan
 */
public class Cit260Project1 {
    
    String instructions = "This is the game of Connect Four. It involves two\n"
            + "players. Each player takes a turn putting a marker in the\n"
            + "bottom empty space of a column. When a player gets four markers\n"
            + "in a row, either horizontal, vertical, or diagonal; that\n"
            + "player wins the game.";
    boolean winner;
    
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
        
        
        
        //at the end of a round, display current scores
        System.out.println("\n\n");
        System.out.println(player1.name + ", your score is " + player1.score + ". You have won " + player1.wins + " games.");
        System.out.println(player2.name + ", your score is " + player2.score + ". You have won " + player2.wins + " games.");
        System.out.println("\n\n");
        if (player1.score > player2.score) {
            player1.score = player1.score + 1;
            player2.score = player2.score - 1;
            System.out.println(player1 + " is the winner of this round! Great work!");
        }
        else if (player2.score > player1.score) {
            player2.score = player2.score + 1;
            player1.score = player1.score - 1;
            System.out.println(player2 + " is the winner of this round! Great work!");
        }
        else if (player1.score == player2.score) {
            System.out.println("It was a tie! You both win this round! Or lose...");
        }
        
   }

    
    public void displayHelp() {
        System.out.println("\nWelcome to Connect Four!" + "\n");
        System.out.println(this.instructions);
 }
}