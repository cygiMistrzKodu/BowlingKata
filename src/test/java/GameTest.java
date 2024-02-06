
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    private Game g;

    @BeforeEach
    public void setUp() {
        g = new Game();
    }

    private void rollMany(int n,int pins) {
        for (int i = 0; i < n; i++) {

            g.roll(pins);
        }
    }

    @Test
    public void gutterGame() {

        rollMany(20,0);
        assertEquals(0, g.score());

    }

    @Test
    public void allOnes() {

        rollMany(20,1);
        assertEquals(20, g.score());

    }

}


