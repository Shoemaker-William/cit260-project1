package cit260.project1.menu;
/*
 * @author Jonathan + William
 */
public class HelpMenuControl {
    
    public HelpMenuControl() {
        
    }

    public void displayBoardHelp() {
        System.out.println();
        System.out.println( 
        "\tThe game board for Connect Four. It consists of a grid of  7 columns"
        + "\n\t and 6 rows. Players choose a column in which to drop their"
        + "\n\t their marker to the bottom. Markers cannot overlap so their "
        + "\n\tis one marker in each spot");
    }

        public void displayGameHelp() {
        System.out.println();
        System.out.println( 
        "\tThis is the game of Connect Four. The object of the game is to get"
        + "\n\t 4 markers in a row horizontally, vertically, or diagonally."
        + "\n\t Each player takes a turn placing their markes on the board "
        + "\n\tto race to be the first to get four in a row.");
    }
    
        public void displayMarkerHelp() {
        System.out.println();
        System.out.println( 
        "\tThe marker for Connect Four. Each player will have a different"
        + "\n\t colored marker to distinguish it from the other player. Each"
        + "\n\t player will place one marker each turn at the bottom of "
        + "\n\twhichever column they wish to go.");
    }    
        
            public void displayPlayerHelp() {
        System.out.println();
        System.out.println( 
        "\tThe players for Connect Four. There are two players in Connect Four"
        + "\n\t. Each of them tries to outwit the other by strategically "
        + "\n\tplacing their markers on the board, blocking each other and "
        + "\n\ttaking the advantage. Each player has a name and a color.");
    }
}