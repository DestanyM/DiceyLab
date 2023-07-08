import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DiceTest {

    @Test
    void constructorTest() {
        Dice player = new Dice(3);
        int expected = 3;
        int numOfDiceThrown = player.getNumOfDiceThrown();

        assertEquals(expected, numOfDiceThrown);
    }

    @Test
    void tossAndSumTest(){
        Dice player = new Dice(2);

        assertNotNull(player.tossAndSum());
    }
    @Test
    void getNumOfDiceThrown(){
        Dice player = new Dice(16);
        int expected = 16;
        int numOfDiceThrown = player.getNumOfDiceThrown();
        assertEquals(expected,numOfDiceThrown);

    }

}