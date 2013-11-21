/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.project1;
/**
 *
 * @author Jonathan Davenport
 */
public abstract class Menu {
    public String[][] menuItems = null; 
    
    public abstract void displayMenu();
    
    public abstract void display();

    protected abstract String getCommand();
}
