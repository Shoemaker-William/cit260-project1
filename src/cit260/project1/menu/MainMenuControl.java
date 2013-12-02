package cit260.project1.menu;

import cit260.project1.Game;
import cit260.project1.HelpMenuView;

/*
 * @author Jonathan + William
 */
public class MainMenuControl {
   
    public MainMenuControl(){
    }
    public void initiateHelp() {
            HelpMenuView help = new HelpMenuView();
            help.displayMenu();
         }   
    public void startGame() {
            Game game = new Game();
            game.doGame();
            //Shouldn't this start the game? 
         }
}