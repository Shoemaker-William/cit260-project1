/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.project1;
/**
 *
 * @author Jonathan Davenport
 */
//William- This should work now. But it is useless. If you could fix the 
//MainMenuView and HelpMenuView so that the code isn't redundant that would be
//great. The best thing might be to change the menu thing into an array like he
//has in the example and then have the display just read through the array. I
//don't know what you want to do, but this would be the most useful.
public abstract class Menu {
    public String menuItems = null;
    
    public Menu(){}
    
    public Menu(String menuItems) {}
    
    public void displayMenu() {}
    
    public void display() {}

    protected String getCommand() {return null;}

}
