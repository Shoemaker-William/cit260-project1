/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg2;

/**
 *
 * @author William
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Try This 1-2*/
        
        double gallons, liters; 
        int counter; 
        
        counter = 0;
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; //convert to liters
            System.out.println(gallons + " gallons is " + liters + " liters.");
            
            counter++;
            //Every 10th line, print a blank line
            if(counter == 10)   {
                System.out.println();
                counter = 0; //reset the line counter
            }
        }
        
        
    }
}
