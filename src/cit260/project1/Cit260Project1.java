package cit260.project1;
/*
 * @authors William + Jonathan
 */
public class Cit260Project1 {
    String instructions = "This is the game of Connect Four. It involves two\n"
            + "players. Each player takes a turn putting a marker in the\n"
            + "bottom empty space of a column. When a player gets four markers\n"
            + "in a row, either horizontal, vertical, or diagonal; that\n"
            + "player wins the game.";
    boolean winner;
    public static void main(String[] args) {
        Cit260Project1 myGame = new Cit260Project1();
        myGame.displayHelp();

        MainMenuView menu = new MainMenuView();
        menu.displayMainMenu();
   }
    public void displayHelp() {
        System.out.println("\nWelcome to Connect Four!" + "\n");
        System.out.println(this.instructions);
 }
}