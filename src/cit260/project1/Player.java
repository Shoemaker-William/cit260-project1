package cit260.project1;
import java.util.Scanner;
/**
 * @author Jonathan Davenport + William Shoemaker
 */
public class Player {
      public String name;
      public String color;
      public String marker;
      int score;
      int wins;
      int losses;
        
    public void getName() {
      Scanner input = new Scanner(System.in);
      System.out.println("Type your name, then press enter to get started: ");
      this.name = input.next();
  }
    public void displayName() {
      System.out.println(name);
  }
    
    public int getScore() {
      score = wins - losses;
      return score;
    }

public static void displayScore(Player player1, Player player2) {
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