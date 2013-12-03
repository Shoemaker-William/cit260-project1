package cit260.project1.menu;
import java.util.Scanner;
/*
 * @author Jonathan + William
 */
public class MainMenuView extends Menu {
    private final static String mainMenuItems = 
        "H     See Help Menu\n"+
        "C     Continue playing\n"+
        "N     Start New Game\n"+
        "Q     Quit Game";
    
private MainMenuControl control = new MainMenuControl();
   public MainMenuView() {
       super(MainMenuView.mainMenuItems);
    }
        @Override
        public void displayMenu() {       
        String command;
        do {
            this.display();
            // get command entered
            command = this.getCommand();
            switch (command) {
                case "H":
                    control.initiateHelp();
                    break;
                case "N":
                    control.startGame();
                    break;
 //So far this does not work yet, we need to make a different version of doGame that won't restart the score count
                case "C":
                    control.startGame();
                    break;
            }
        } while(!"Q".equals(command));  
    }
        // displays the main menu
    @Override    
    public final void display() {
        System.out.println("\n\t*********************************************************");
        System.out.println("\tPlease choose what you would like to do:");
        System.out.println(mainMenuItems);
        System.out.println("\t*********************************************************\n");
    }
// retrieves the command entered by the end user
    @Override
    public String getCommand() {
        Scanner inFile = new Scanner(System.in);
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine(); //gets input
            command = command.trim().toUpperCase(); //changes it to uppercase
            if ("H".equals(command) || "N".equals(command) || "C".equals(command) || "Q".equals(command))
                valid = true;
            else {
                System.out.println("Invalid command. Please enter a valid command.");
                continue;
            }
        } while (!valid);
      return command;
    }

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayError() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}