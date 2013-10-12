package cit260.project1;
import java.util.Scanner;

/**
 * @author Jonathan Davenport + William Shoemaker
 */
public class Player {
      public String name;
      public String color;
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
}