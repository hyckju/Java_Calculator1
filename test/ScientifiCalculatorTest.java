import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScientifiCalculatorTest {

    @Test
    void testPower() {
        ScientifiCalculator  sci = new ScientifiCalculator();
        sci.setNumbers(4,2);
        assertEquals(16,sci.power());

    }
}