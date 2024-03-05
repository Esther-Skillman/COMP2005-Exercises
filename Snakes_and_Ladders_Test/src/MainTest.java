import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void playerMovesAfterRollDice() {
        Main.rollDice();
        int playerPosition = Main.playerPosition;
        assertEquals(playerPosition, 0);

    }
}