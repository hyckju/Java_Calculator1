import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScientifiCalculatorTest {

    @Test
    void testPower() {
        ScientifiCalculator sccalc = new ScientifiCalculator();
        sccalc.setNumbers(3,3);
        assertEquals(27, sccalc.power());
    }
}