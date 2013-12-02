/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.project1;

/**
 *
 * @author Jonathan
 */
public enum Status {
    CONTINUE ("CONTINUE"),
    NEW_GAME ("NEW_GAME"),
    PLAYING ("PLAYING"),
    WINNER ("WINNER"),
    TIE ("TIE"),
    QUIT ("QUIT"),
    ERROR ("ERROR"),
    EXIT ("EXIT");
    
    String value;
    
    Status(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    
}
