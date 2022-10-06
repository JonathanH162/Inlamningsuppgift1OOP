package G_VGuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmtreeTest {

    Palmtree palmtree = new Palmtree("Laura", 5);

    @Test
    void testPalmTreeCalculation() {
        assert(palmtree.plantCalculation() == 2.5);
        assert(palmtree.plantCalculation() != 5);
    }
}