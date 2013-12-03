/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.project1.player;

/**
 *
 * @author Jonathan
 */
public enum Markers {
    X ("X"),
    O ("O");
    String value;
    
    Markers(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
}
}