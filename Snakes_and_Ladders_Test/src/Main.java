import java.util.HashMap;

public class Main {

    // key is the head of the snake, value is the tail
    HashMap<Integer, Integer> snakes = new HashMap<Integer, Integer>();

    // key is the bottom of the ladder, value is the ladder top
    HashMap<Integer, Integer> ladders = new HashMap<Integer, Integer>();

    // "You need to keep track of where the player is"
    public static int playerPosition = 0;

    // Keeps track of if the player has won
    public static boolean playerWon = false;

    //  "You need a method that rolls the dice to work out the player’s new position on the board."
    public static int rollDice(){
        // function will assign a variable 'roll' a random number from 2 to 12
        // adds to playerPosition
        // calls checkTileValue(),
        // returns roll
        checkTileValue();
        return 0;
    }

    // Checks if player has landed on a tail head, ladder bottom or has won the game by reaching 100
    public static void checkTileValue(){
        // checks if playerPosition => 100, calls playerHasWon()
        // checks if playerPosition matches any of the keys in snakes (snake head) and rewrites playerPosition to the key's value (snake tail), informs user
        // checks if playerPosition matches any of the keys in ladders (ladder bottom) and rewrites playerPosition to the key's value (ladders top), informs user
    }

    // "You need a method that checks if the player has won so that it returns a message informing him/her that he/she has finished."
    public static void playerHasWon(){
        // sets playerWon = True, informs user they have won
    }


    public static void main(String[] args) {
        //Initialises snakes and ladders keys and values
        // calls rollDice() and prints player position while playerWon = false
        while (playerWon == false){
            System.out.println("Rolled dice: " + rollDice());
            System.out.println("Current player position: " + playerPosition);
        }

    }
}