import java.util.HashMap;

public class Main {

    // key is the head of the snake, value is the tail
    HashMap<Integer, Integer> snakes = new HashMap<Integer, Integer>();

    // key is the bottom of the ladder, value is the ladder top
    HashMap<Integer, Integer> ladders = new HashMap<Integer, Integer>();

    // "You need to keep track of where the player is"
    public int playerPosition = 0;

    // Keeps track of if the player has won
    public boolean playerWon = False;

    //  "You need a method that rolls the dice to work out the player’s new position on the board."
    public static int rollDice(){
        // asks for player input to role dice with 'r'
        // if playerInput = 'r' function will sum two random values from 1 to 6 together
        // adds this sum to the current playerPosition
        // call the checkTileValue(),
        // and return this sum to notify the user
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
        // sets playerWon = True, informs user, asks for player input to restart ("Would you like to restart (Y/N)?")
        // if player input = Y, playerWon = False, playerPosition = 0, rollDice() is called
        // if player input = N, print "thank you for playing" and nothing more happens

    }


    public static void main(String[] args) {

        // calls rollDice() and prints player position while playerWon = false

    }
}