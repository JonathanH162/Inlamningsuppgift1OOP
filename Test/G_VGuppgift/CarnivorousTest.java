package G_VGuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CarnivorousTest {
    Carnivorous carnivorous = new Carnivorous("Meatloaf", 0.7);
    @Test
    void testCarnivorousCalculation() {
        assert(carnivorous.plantCalculation() == 0.24);
        assert(carnivorous.plantCalculation() != 1.3);
    }
}