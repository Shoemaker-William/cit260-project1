package cit260.project1.player;

import java.util.Scanner;

/*
 * @author Jonathan Davenport
 */
public class humanPlayer extends Player {

    @Override
    public void getName() {
      Scanner input = new Scanner(System.in);
      System.out.println("Type your name, then press enter to get started: ");
      this.name = input.next();
  }
    
}
