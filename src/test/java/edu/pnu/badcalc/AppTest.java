package edu.pnu.badcalc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testMainRuns() {
        String[] args = {};
        assertDoesNotThrow(() -> App.main(args));
    }
}
