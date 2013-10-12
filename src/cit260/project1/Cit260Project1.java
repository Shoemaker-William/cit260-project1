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
            player1.wins = player1.wins + 1;
            player2.losses = player2.losses - 1;
            System.out.println(player1 + " is the winner of this round! Great work!");
        }
        else if (player2.score > player1.score) {
            player2.score = player2.score + 1;
            player1.score = player1.score - 1;
            player2.wins = player2.wins + 1;
            player1.losses = player1.losses - 1;
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
}
