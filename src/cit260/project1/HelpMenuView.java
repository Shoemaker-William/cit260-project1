/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.project1;

import java.util.Scanner;

/**
 *
 * @author Jonathan Davenport
 */
public class HelpMenuView {
         
   
    private final static String menuItems = 
        "B  The board\n"
        +"G  The Connect Four game\n"
        +"M  Markers\n"
        +"P  Players\n"        
        +"Q  Quit Help\n";
    
    private HelpMenuControl control = new HelpMenuControl();
    
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void displayHelpMenu() {       
        String command;
        do {
            this.display();
            
            // get command entered
            command = this.getCommand();
            switch (command) {
                case "B":
                    control.displayBoardHelp();
                    break;
                case "G":
                    control.displayGameHelp();
                    break;                  
                case "M":
                    control.displayMarkerHelp();
                    break;
                 case "P":
                    control.displayPlayerHelp();
                    break; 
            }
        } while(!"Q".equals(command));  
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t*********************************************************");
        System.out.println("\tPlease enter the letter for the topic that you "
                + "have questions about:");

     
            System.out.println(menuItems);
     
        System.out.println("\t*********************************************************\n");
    }

    
    
    // retrieves the command entered by the end user
    protected final String getCommand() {

        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {

            command = inFile.nextLine(); //gets input
            command = command.trim().toUpperCase(); //changes it to uppercase
            if ("B".equals(command) || "G".equals(command) || "M".equals(command) 
                    || "P".equals(command) || "Q".equals(command)) valid = true;
            else {
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }
     
  
}
