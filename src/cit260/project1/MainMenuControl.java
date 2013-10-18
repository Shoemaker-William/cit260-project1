/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.project1;

/**
 *
 * @author Jonathan Davenport
 */
public class MainMenuControl {
    
    public MainMenuControl(){
        
    }
         public void initiateHelp() {
            HelpMenuView help = new HelpMenuView();
            help.displayHelpMenu();
         }   
         public void startGame() {
             Game game = new Game();
             game.doGame();
         }
}
