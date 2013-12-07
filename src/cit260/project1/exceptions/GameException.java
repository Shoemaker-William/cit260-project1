/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.project1.exceptions;

/**
 *
 * @author Jonathan
 */
public class GameException extends Exception {
    public GameException(){
    }
    
    public GameException(String message) {
        super(message);
    }
    
    public GameException(String message, Throwable cause){
        super(message, cause);
    }
    
    public GameException(Throwable cause){
        super(cause);
    }
}
